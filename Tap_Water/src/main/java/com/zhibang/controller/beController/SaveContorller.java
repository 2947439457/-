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
 * @ClassName SaveContorller.java
 * @Description TODO 档案存档
 * @createTime 2020年12月29日 23:33:00
 */
@Controller
@RequestMapping("/be")
public class SaveContorller {

    @Autowired private OrderService orderService;
    @Autowired private OrderUserService orderUserService;

    //跳转供水协议页面:yjh
    @GetMapping("/save")
    public String save(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(8, "1,2,3,4,5,6,7");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__save";
    }

    //跳转供水协议处理页面:yjh
    public String saveForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        return "/page/be__saveForm";
    }

}
