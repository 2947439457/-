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
 * @ClassName ContractController.java
 * @Description TODO 供水协议
 * @createTime 2020年12月29日 19:53:00
 */
@Controller
@RequestMapping("/be")
public class ContractController {

    @Autowired private OrderService orderService;
    @Autowired private OrderUserService orderUserService;

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

}
