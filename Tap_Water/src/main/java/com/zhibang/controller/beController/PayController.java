package com.zhibang.controller.beController;

import com.alibaba.fastjson.JSONObject;
import com.zhibang.model.*;
import com.zhibang.service.beService.OrderService;
import com.zhibang.service.beService.OrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PayContorller.java
 * @Description TODO 交施工费
 * @createTime 2020年12月16日 01:26:00
 */
@Controller
@RequestMapping("/be")
public class PayController {

    @Autowired private OrderService orderService;
    @Autowired private OrderUserService orderUserService;
    @Autowired private BeOrder beOrder;
    @Autowired private UsUser usUser;
    @Autowired private BeFlow beFlow;

    //跳转交施工费页面:yjh
    @GetMapping("/pay")
    public String pay(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(3, "1,2,5,6");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__pay";
    }

    //跳转交施工费处理页面:yjh
    public String payForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        return "/page/be__payForm";
    }

    //处理
    @ResponseBody
    @RequestMapping(value = "/disposePay")
    public Integer nosendpay(String stmt, String orderNo, Integer orderType, Double projectMoney, Double realMoney,
        Double userMoney,String userNo, String orderUserMoney, HttpSession httpSession){
        Integer integer = 0;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            SyEmp upSyEmp = (SyEmp) httpSession.getAttribute("s");
            upBeOrder.setLastEditEmp(upSyEmp);
            upBeOrder.setProjectMoney(projectMoney);
            upBeOrder.setRealMoney(realMoney);

            UsUser upUsUser = usUser;
            upUsUser.setUserNo(userNo);
            upUsUser.setUserMoney(userMoney);
            Integer i1 = orderService.upOrderAndUserMoney(upBeOrder, upUsUser);

            List<BeOrderuser> list = JSONObject.parseArray(orderUserMoney, BeOrderuser.class);
            for (BeOrderuser beOrderuser : list) {
                beOrderuser.setOrderNo(upBeOrder);
                Integer i = orderUserService.upOrderuserMoney(beOrderuser);
            }
            BeFlow upstepId = beFlow;
            upstepId.setId(3);
            upBeOrder.setStepId(upstepId);
            integer = 1;
            if ("send".equals(stmt) || "recall".equals(stmt)){
                orderService.upBeOrderStepId(stmt, upBeOrder);
                integer = 2;
            }
        }catch (Exception e){
            integer = 3;
            e.printStackTrace();
        }
        return integer;
    }

}
