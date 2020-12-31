package com.zhibang.controller.beController;

import com.zhibang.model.BeOrder;
import com.zhibang.model.BeOrderuser;
import com.zhibang.service.beService.OrderService;
import com.zhibang.service.beService.OrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @Autowired private OrderUserService orderUserService;

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

}
