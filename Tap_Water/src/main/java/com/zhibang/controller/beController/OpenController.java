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
 * @ClassName OpenController.java
 * @Description TODO 通水停水
 * @createTime 2020年12月29日 23:22:00
 */
@Controller
@RequestMapping("/be")
public class OpenController {

    @Autowired private OrderService orderService;
    @Autowired private BeOrder beOrder;
    @Autowired private BeFlow beFlow;

    //跳转通水停水页面:yjh
    @GetMapping("/open")
    public String open(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(7, "1,2,5,6,7");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__open";
    }

    //跳转通水停水处理页面:yjh
    public String openForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        return "/page/be__openForm";
    }

    //处理
    @ResponseBody
    @RequestMapping(value = "/disposeOpen")
    public Integer nosendOpen(String stmt, String orderNo, Integer orderType, HttpSession httpSession){
        Integer integer = 0;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            SyEmp upSyEmp = (SyEmp) httpSession.getAttribute("s");
            upBeOrder.setLastEditEmp(upSyEmp);


            BeFlow upstepId = beFlow;
            upstepId.setId(7);
            upBeOrder.setStepId(upstepId);
            orderService.upBeOrderStepId(stmt, upBeOrder);
            integer = 1;
        }catch (Exception e){
            integer = 2;
            e.printStackTrace();
        }
        return integer;
    }

}
