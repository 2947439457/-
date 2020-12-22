package com.zhibang.controller.beController;

import com.zhibang.mapper.beMapper.OrderUserMapper;
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

    @Autowired
    public Common common; //工具类
    @Autowired
    public UsUser usUser; //用户实体类
    @Autowired
    public BeOrder beOrder; //业扩工单实体类
    @Autowired
    public BeFlow beFlow; //流程模板实体类
    @Autowired
    public SyEmp syEmp; //员工表
    @Autowired
    public BeOrderuser beOrderuser; //工单用户详情
    @Autowired
    public SyMetertype syMetertype; //水表型号表
    @Autowired
    public MetertypeService metertypeService;
    @Autowired
    public UserService userService;
    @Autowired
    public OrderService orderService;
    @Autowired
    public OrderUserService orderUserService;

    //跳转用户申请界面:yjh
    @GetMapping(value = "/request")
    public String request(HttpSession httpSession) {
        List<SyMetertype> syMetertypes = metertypeService.selSyMetertype();
        httpSession.setAttribute("syMetertypes", syMetertypes);
        return "/page/be__request";
    }

    //跳转选择办理业务:yjh
    @GetMapping(value = "/requestInt")
    public String requestInt(Integer rid) {
        String requestId = "/page/be__request" + rid;
        return requestId;
    }

    //跳转用户申请界面
    @GetMapping(value = "/requestOrder")
    public String requestOrder(Integer stepId, String orderType, Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(stepId, orderType);
        model.addAttribute("beOrders", beOrders);
        return "/page/be__requestOrder";
    }

    //用户申请处理
//    @RequestMapping(value = "/requestOrderJudge")
//    public String requestOrderJudge(String orderNo, Model model){
//        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
//        Integer orderType = beOrder.getOrderType();
//        model.addAttribute("beOrder", beOrder);
//        beOrder.getUserNo()
//        userService.selUsUser()
//        return "/page/be__request"+orderType;
//    }

    //点击办理，进行判断：yjh
    @RequestMapping("/judge")
    @ResponseBody
    public Integer judge(Integer orderType, String userName, String userType, String phone, String address, Integer maxAmount,
                         String meterTypeName, Integer meterCount, Integer houseHeight, String useTarget, String userRemark, HttpSession httpSession,
                         String[] userNames, String[] phones, String[] addresss) {
        Integer integer;
        try {
            SyMetertype addsyMetertype = syMetertype; //水表型号
            List<SyMetertype> syMetertypes = (List<SyMetertype>) httpSession.getAttribute("syMetertypes");
            for (SyMetertype syMetertype : syMetertypes) {
                if (syMetertype.getMeterTypeName().equals(meterTypeName)) {
                    addsyMetertype = syMetertype;
                }
            }
            String orderNo = common.OrderNo(orderType); //生成业扩工单
            String userNo = common.UserNo(orderType); //生成用户编码
            //添加用户
            UsUser addUsUser = usUser;
            addUsUser.setUserNo(userNo); //用户编码
            addUsUser.setUserName(userName); //用户名称
            addUsUser.setUserType(userType); //用户类型
            addUsUser.setPhone(phone); //用户手机号
            addUsUser.setAddress(address); //用户地址
            //添加业扩工单
            BeOrder addBeOrder = beOrder;
            addBeOrder.setOrderNo(orderNo);
            addBeOrder.setOrderType(orderType); //办理的业务
            BeFlow addBeFlow = beFlow;
            addBeFlow.setId(2);
            addBeOrder.setStepId(addBeFlow); //业务流程
//            SyEmp createEmp = syEmp; //??????????????登录的员工
            SyEmp createEmp = (SyEmp) httpSession.getAttribute("s");
//            createEmp.setId(7);
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
            //添加工单用户详情
            BeOrderuser addbeOrderuser;
            List<BeOrderuser> beOrderusers = new ArrayList<>();
            for (int i = 0; i < meterCount; i++) {
                addbeOrderuser = beOrderuser;
                addbeOrderuser.setOrderNo(addBeOrder); //业扩工单
                addbeOrderuser.setUserName(userNames[i]); //用户姓名
                addbeOrderuser.setPhone(phones[i]); //用户电话
                addbeOrderuser.setAddress(addresss[i]); //用户地址
                addbeOrderuser.setMeterTypeId(1); //水表编码
                addbeOrderuser.setMaxValue(999); //最大码表
                addbeOrderuser.setUserNo(userNo); //用户编码
                beOrderusers.add(addbeOrderuser);
            }

            //执行方法
            userService.addUserAndOrder(addUsUser, addBeOrder, beOrderusers);
            integer = 1;
        } catch (Exception e) {
            integer = 0;
            e.printStackTrace();
        }
        return integer;
    }

    //跳转成功界面：yjh
    @RequestMapping("/success")
    public String success() {
        return "/page/success";
    }

    //跳转失败界面：yjh
    @RequestMapping("/error")
    public String error() {
        return "/page/error";
    }

}
