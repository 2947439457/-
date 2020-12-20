package com.zhibang.controller.beController;

import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @Autowired
    public OrderService orderService;

    //跳转交施工费页面:yjh
    @GetMapping("/pay")
    public String pay(Integer stepId, String orderType, Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(stepId, orderType);
        model.addAttribute("beOrders", beOrders);
        return "/page/be__pay";
    }

    //跳转交施工费处理页面:yjh
    @GetMapping("/payForm")
    public String payForm(){
        return "/page/be__payForm";
    }

}
