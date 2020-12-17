package com.zhibang.controller.bes;

import com.zhibang.model.*;
import com.zhibang.service.sy.MetertypeService;
import com.zhibang.service.us.UserService;
import com.zhibang.utils.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired public Common common; //工具类
    @Autowired public UsUser usUser; //用户实体类
    @Autowired public BeOrder beOrder; //业扩工单实体类
    @Autowired public BeFlow beFlow; //流程模板实体类
    @Autowired public SyEmp syEmp; //员工表
    @Autowired public MetertypeService metertypeService;
    @Autowired public UserService userService;

    //跳转用户申请界面:yjh
    @GetMapping(value = "/request")
    public String request(){
        String s = common.OrderNo(1);
        System.out.println(s);
        return  "/page/be__request";
    }

    //跳转选择办理业务:yjh
    @GetMapping(value = "/requestInt")
    public String requestInt(Integer rid, Model model){
        List<SyMetertype> syMetertypes = metertypeService.selSyMetertype();
        model.addAttribute("syMetertypes", syMetertypes);
        String requestId = "/page/be__request" + rid;
        return requestId;
    }

    //点击办理，进行判断：yjh
    @RequestMapping("/judge")
    @ResponseBody
    public Integer judge(Integer orderType, String userName, String userType, String phone,String address,
                         Integer maxAmount, Integer houseHeight, String useTarget, String userRemark){
        String userNo = common.UserNo(orderType); //生成用户编码
        String orderNo = common.OrderNo(orderType); //生成业扩工单
        UsUser addUsUser = usUser; //添加用户
        addUsUser.setUserNo(userNo); //用户编码
        addUsUser.setUserName(userName); //用户名称
        addUsUser.setUserType(userType); //用户类型
        addUsUser.setPhone(phone); //用户手机号
        addUsUser.setAddress(address); //用户地址

        BeOrder addBeOrder = beOrder;
        addBeOrder.setOrderType(orderType); //办理的业务

        BeFlow addBeFlow = beFlow;
        addBeFlow.setId(2);
        addBeOrder.setStepId(addBeFlow); //业务流程

        SyEmp createEmp = syEmp; //??????????????登录的员工
        createEmp.setId(7);
        addBeOrder.setCreateEmp(createEmp); //建单员工

        SyEmp lastEditEmp = syEmp; //最后操作员工
        lastEditEmp.setId(7);
        addBeOrder.setLastEditEmp(lastEditEmp); //最后操作员工

        addBeOrder.setUserNo(addUsUser); //用户编码
        addBeOrder.setMaxAmount(maxAmount); //用水量
        addBeOrder.setHouseHeight(houseHeight); //房屋层次
        addBeOrder.setUseTarget(useTarget); //接水用途
        addBeOrder.setUserRemark(userRemark); //用户申请的备注说明
//        Integer integer = userService.addUserAndOrder(addUsUser, addBeOrder);
        System.out.println(addUsUser);
        System.out.println(addBeOrder);
        return 1;
    }

}
