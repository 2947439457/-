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
 * @ClassName BillclearController.java
 * @Description TODO 水费清单
 * @createTime 2020年12月16日 01:36:00
 */
@Controller
@RequestMapping("/be")
public class BillclearController {

    @Autowired private OrderService orderService;

    //跳转水费清单界面:yjh
    @GetMapping("/billclear")
    public String billclear(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(4, "2,7");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__billclear";
    }

    //跳转水费清单处理界面:yjh
    @GetMapping("/billclearForm")
    public String billclearForm(){
        return "/page/be__billclearForm";
    }

}
