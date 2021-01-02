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

    @Autowired private BeOrder beOrder; // 业扩工单-实体类
    @Autowired private BeFlow beFlow; //业务流程-实体类
    @Autowired private SyEmp syEmp; //员工-实体类
    @Autowired private OrderService orderService; //工单-数据访问层

    //跳转初步审核界面-yjh
    @GetMapping(value = "/audit")
    public String Audit(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(2, "1,2,3,4,5,6,7");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__audit";
    }

    //初步审核处理界面-yjh
    public String auditForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        return "/page/be__auditForm";
    }

    //初步审核提交/撤回-yjh
    @RequestMapping(value = "/disposeAudit")
    public String disposeAudit(String stmt, String orderNo, String audit, Integer orderType, HttpSession session){
        Integer integer;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            BeFlow upstepId = beFlow;
            upstepId.setId(2);
            upBeOrder.setStepId(upstepId);
            SyEmp lEmp = (SyEmp) session.getAttribute("s"); //当前登录人员
            upBeOrder.setLastEditEmp(lEmp);
            SyEmp aEmp = syEmp;
            aEmp.setId(lEmp.getId());
            upBeOrder.setAuditEmpId(aEmp);
            upBeOrder.setAuditMessage(audit);
            integer = orderService.upBeOrderStepId(stmt, upBeOrder);
        }catch (Exception e){
            integer = 0;
            e.printStackTrace();
        }
        if (integer == 1){
            return "redirect:/success/be/audit";
        }else{
            return "redirect:/error/be/audit";
        }
    }

}
