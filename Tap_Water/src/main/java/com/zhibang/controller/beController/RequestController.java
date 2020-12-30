package com.zhibang.controller.beController;

import com.zhibang.model.*;
import com.zhibang.service.beService.OrderService;
import com.zhibang.service.beService.OrderUserService;
import com.zhibang.service.syService.MetertypeService;
import com.zhibang.service.usService.UserService;
import com.zhibang.utils.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName RequestController.java
 * @Description TODO 用户申请
 * @createTime 2020年12月14日 10:19:00
 */

@Controller
@RequestMapping("/be")
public class RequestController {

    @Autowired private Common common; //工具类
    @Autowired private UsUser usUser; //用户-实体类
    @Autowired private BeOrder beOrder; //业扩工单-实体类
    @Autowired private BeFlow beFlow; //流程模板-实体类
    @Autowired private SyEmp syEmp; //员工-实体类
    @Autowired private BeOrderuser beOrderuser; //工单用户详情-实体类
    @Autowired private SyMetertype syMetertype; //水表型号表-实体类
    @Autowired private MetertypeService metertypeService; //水表型号-数据访问层
    @Autowired private UserService userService; //用户-数据访问层
    @Autowired private OrderService orderService; //工单信息-数据访问层
    @Autowired private OrderUserService orderUserService; //工单用户信息详情-数据访问层

    //跳转用户申请界面-yjh
    @GetMapping(value = "/request")
    public String request() {
        return "/page/be__request";
    }

    //跳转选择办理业务-yjh
    @GetMapping(value = "/requestInt")
    public String requestInt(Integer orderType) {
        String requestId = "/page/be__request" + orderType;
        return requestId;
    }

    //跳转用户申请工单界面-yjh
    @GetMapping(value = "/requestOrder")
    public String requestOrder(Model model){
        //查询流程为1，办理业务为1,2,3,4,5,6,7的所有工单
        List<BeOrder> beOrders = orderService.selBeOrderStepId(1, "1,2,3,4,5,6,7");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__requestOrder";
    }

    //用户申请处理-yjh
    @RequestMapping(value = "/requestOrderJudge")
    public String requestOrderJudge(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        model.addAttribute("stat", "update");
        return "/page/be__request"+beOrder.getOrderType();
    }

    //点击办理，进行判断-yjh
    @ResponseBody
    @RequestMapping("/judge")
    public Integer judge(Integer orderType, String userName, String userType, String phone, String address, Integer maxAmount,
                         String meterTypeName, Integer meterCount, Integer houseHeight, String useTarget, String userRemark, HttpSession httpSession,
                         String[] userNames, String[] phones, String[] addresss, String stat, String orderNo, String userNo) {
        Integer integer = 0;
        SyMetertype addsyMetertype = syMetertype; //水表型号
        List<SyMetertype> syMetertypes = (List<SyMetertype>) httpSession.getAttribute("syMetertypes");
        for (SyMetertype syMetertype : syMetertypes) {
            if (syMetertype.getMeterTypeName().equals(meterTypeName)) {
                addsyMetertype = syMetertype;
            }
        }
        //添加用户
        UsUser addUsUser = usUser;
        addUsUser.setUserName(userName); //用户名称
        addUsUser.setUserType(userType); //用户类型
        addUsUser.setPhone(phone); //用户手机号
        addUsUser.setAddress(address); //用户地址
        addUsUser.setMeterId(addsyMetertype); //水表型号
        //添加业扩工单
        BeOrder addBeOrder = beOrder;
        addBeOrder.setOrderType(orderType); //办理的业务
        BeFlow addBeFlow = beFlow;
        addBeFlow.setId(1);
        addBeOrder.setStepId(addBeFlow); //业务流程
        SyEmp createEmp = (SyEmp) httpSession.getAttribute("s");
        addBeOrder.setCreateEmp(createEmp); //建单员工
        SyEmp lastEditEmp = syEmp; //最后操作员工
        lastEditEmp.setId(createEmp.getId());
        addBeOrder.setLastEditEmp(lastEditEmp); //最后操作员工
        addBeOrder.setUserNo(addUsUser); //用户编码
        addBeOrder.setMaxAmount(maxAmount); //用水量
        addBeOrder.setMeterTypeId(addsyMetertype); //对应的水表
        addBeOrder.setHouseHeight(houseHeight); //房屋层次
        addBeOrder.setUseTarget(useTarget); //接水用途
        addBeOrder.setMeterCount(meterCount); //水表数
        addBeOrder.setUserRemark(userRemark); //用户申请的备注说明

        if (orderType == 1){ //办理新户
            if ("0".equals(orderNo) || "0".equals(userNo)){
                String addorderNo = common.OrderNo(orderType); //生成业扩工单
                String adduserNo = common.UserNo(orderType); //生成用户编码
                addUsUser.setUserNo(adduserNo); //用户编码
                addBeOrder.setOrderNo(addorderNo);//工单号
            }else {
                addUsUser.setUserNo(userNo); //用户编码
                addBeOrder.setOrderNo(orderNo); //工单号
            }
            //添加工单用户详情
            List<BeOrderuser> beOrderusers = new ArrayList<BeOrderuser>();
            for (int i = 0; i < meterCount; i++) {
                BeOrderuser addbeOrderuser = new BeOrderuser();
                addbeOrderuser.setOrderNo(addBeOrder); //业扩工单
                addbeOrderuser.setUserName(userNames[i]); //用户姓名
                addbeOrderuser.setPhone(phones[i]); //用户电话
                addbeOrderuser.setAddress(addresss[i]); //用户地址
                addbeOrderuser.setMeterTypeId(addsyMetertype.getId()); //水表编码
                addbeOrderuser.setMeterName(addsyMetertype.getMeterTypeName()); //水表表身码
                addbeOrderuser.setStartValue(0);
                addbeOrderuser.setMaxValue(addsyMetertype.getMavValue()); //最大码表
                addbeOrderuser.setUserNo(addUsUser); //用户编码
                beOrderusers.add(addbeOrderuser);

            }
            if ("update".equals(stat)){
                try {
                    //执行修改方法
                    integer = userService.updateUserAndOrder(addUsUser, addBeOrder, beOrderusers);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    //执行添加方法
                    integer = userService.addUserAndOrder(addUsUser, addBeOrder, beOrderusers);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if(orderType == 2){ //办理分户

        }
        if(orderType == 3){ //办理过户

        }
        if(orderType == 4){ //办理代扣

        }
        if(orderType == 5){ //办理换表

        }
        if(orderType == 6){ //办理重签

        }
        if(orderType == 7){ //办理销户

        }
        return integer;
    }

}
