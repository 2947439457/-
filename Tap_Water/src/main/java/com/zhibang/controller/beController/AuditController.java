package com.zhibang.controller.beController;

import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
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
 * @ClassName AuditController.java
 * @Description TODO 初步审核
 * @createTime 2020年12月16日 01:13:00
 */
@Controller
@RequestMapping("/be")
public class AuditController {

    @Autowired public BeOrder beOrder;
    @Autowired public BeFlow beFlow;
    @Autowired public SyEmp syEmp;
    @Autowired public OrderService orderService;

    //跳转初步审核界面:yjh
    @GetMapping(value = "/audit")
    public String Audit(Integer stepId, String orderType, Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(stepId, orderType);
        model.addAttribute("beOrders", beOrders);
        return "/page/be__audit";
    }

    //跳转初步审核处理界面:yjh
    @GetMapping(value = "/auditForm")
    public String auditForm(String orderNo, String userName,Integer orderType, Model model){
        model.addAttribute("orderNo", orderNo);
        model.addAttribute("userName", userName);
        model.addAttribute("orderType", orderType);
        return "/page/be__auditForm";
    }

    //初步审核提交/撤回：yjh
    @RequestMapping(value = "/disposeAudit")
    public String sendAudit(String stmt, Integer stepId, String orderNo, String audit, Integer orderType, HttpSession session){
        Integer integer;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            BeFlow upstepId = beFlow;
            upstepId.setId(stepId);
            upBeOrder.setStepId(upstepId);
            SyEmp lEmp = (SyEmp) session.getAttribute("s"); //当前登录人员
//            SyEmp lEmp = syEmp;
//            lEmp.setId(4);
            upBeOrder.setLastEditEmp(lEmp);
            SyEmp aEmp = syEmp;
            aEmp.setId(lEmp.getId());
            upBeOrder.setLastEditEmp(aEmp);
            upBeOrder.setAuditMessage(audit);
            integer = orderService.upBeOrderStepId(stmt, upBeOrder);
        }catch (Exception e){
            integer = 0;
            e.printStackTrace();
        }
        if (integer == 1){
            return "/page/success";
        }else{
            return "/page/error";
        }

    }

}
