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
 * @ClassName ContractController.java
 * @Description TODO 供水协议
 * @createTime 2020年12月29日 19:53:00
 */
@Controller
@RequestMapping("/be")
public class ContractController {

    @Autowired private OrderService orderService;
    @Autowired private OrderUserService orderUserService;
    @Autowired private BeOrder beOrder;
    @Autowired private UsUser usUser;
    @Autowired private BeFlow beFlow;

    //跳转供水协议页面:yjh
    @GetMapping("/contarct")
    public String contarct(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(5, "1,2");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__contract";
    }

    //跳转供水协议处理页面:yjh
    public String contarctForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        return "/page/be__contractForm";
    }

    //处理
    @ResponseBody
    @RequestMapping(value = "/disposeContract")
    public Integer nosendpay(String stmt, String orderNo, Integer orderType, String userNo,
                             String formula, String contractNum, String orderUser, HttpSession httpSession){
        Integer integer = 0;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            SyEmp upSyEmp = (SyEmp) httpSession.getAttribute("s");
            upBeOrder.setLastEditEmp(upSyEmp);

            UsUser upUsUser = usUser;
            upUsUser.setUserNo(userNo);
            upUsUser.setFormula(formula);
            upUsUser.setContractNum(contractNum);

//            orderService.upOrderAndUserFormula(upBeOrder, upUsUser);

            List<BeOrderuser> list = JSONObject.parseArray(orderUser, BeOrderuser.class);
            for (BeOrderuser beOrderuser : list) {
                beOrderuser.setOrderNo(upBeOrder);
                System.out.println(beOrderuser);
                orderUserService.upOrderuserFormula(beOrderuser);
            }

            BeFlow upstepId = beFlow;
            upstepId.setId(5);
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
