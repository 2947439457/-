package com.zhibang.controller.beController;

import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.model.BeOrderuser;
import com.zhibang.model.SyEmp;
import com.zhibang.service.beService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @Autowired
    public OrderService orderService;
    @Autowired public OrderMapper orderMapper;

    //跳转交施工费页面:yjh
    @GetMapping("/pay")
    public String pay(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(3, "1,2,5,6");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__pay";
    }

    //跳转交施工费处理页面:yjh
    public String payForm(String orderNo, Model model){
        BeOrder beOrder = orderMapper.selectBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderMapper.selectBeOrderUserOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        return "/page/be__payForm";
    }

//    //保存不发送-yjh
//    @PostMapping(value = "/nosendpay")
//    public Integer nosendpay(){
//
//    }

    //交施工费提交/撤回-yjh
    @RequestMapping(value = "/disposePay")
    public String disposePay(String stmt, String orderNo, Integer orderType, HttpSession session){
        Integer integer = 0;
        try {

        }catch (Exception e){
            integer = 0;
            e.printStackTrace();
        }
        if (integer == 1){
            return "redirect:/success/be/pay/3/1,2,5,6";
        }else{
            return "redirect:/error/be/pay/3/1,2,5,6";
        }
    }

}
