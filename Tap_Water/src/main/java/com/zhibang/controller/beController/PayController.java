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
    public String pay(Integer stepId, String orderType, Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(stepId, orderType);
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

//    //初步审核提交/撤回-yjh
//    @RequestMapping(value = "/disposePay")
//    public String sendpay(String stmt, String orderNo, String audit, Integer orderType, HttpSession session){
//        Integer integer;
//        try {
//            BeOrder upBeOrder = beOrder;
//            upBeOrder.setOrderNo(orderNo);
//            upBeOrder.setOrderType(orderType);
//            BeFlow upstepId = beFlow;
//            upstepId.setId(2);
//            upBeOrder.setStepId(upstepId);
//            SyEmp lEmp = (SyEmp) session.getAttribute("s"); //当前登录人员
//            upBeOrder.setLastEditEmp(lEmp);
//            SyEmp aEmp = syEmp;
//            aEmp.setId(lEmp.getId());
//            upBeOrder.setAuditEmpId(aEmp);
//            upBeOrder.setAuditMessage(audit);
//            integer = orderService.upBeOrderStepId(stmt, upBeOrder);
//        }catch (Exception e){
//            integer = 0;
//            e.printStackTrace();
//        }
//        if (integer == 1){
//            return "redirect:/success/be/audit/2/1,2,3,4,5,6,7";
//        }else{
//            return "redirect:/error/be/audit/2/1,2,3,4,5,6,7";
//        }
//    }

}
