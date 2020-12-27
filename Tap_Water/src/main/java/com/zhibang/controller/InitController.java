package com.zhibang.controller;

import com.zhibang.controller.beController.AuditController;
import com.zhibang.controller.beController.PayController;
import com.zhibang.controller.beController.RequestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InitController.java
 * @Description TODO
 * @createTime 2020年12月11日 09:34:00
 */
@Controller
@RequestMapping("/be")
public class InitController {

    @Autowired public AuditController auditController;
    @Autowired public PayController payController;
    @Autowired public RequestController requestController;

    //对业扩流程操作进行处理
    @RequestMapping("/chuLi")
    public String chuLi(String stepName, String orderNo, Integer orderType, String userName, Model model){
        String path = "";
        if("用户申请".equals(stepName)){
            path = requestController.requestOrderJudge(orderNo, orderType, model);
        }
        if("初步审核".equals(stepName)){
            path = auditController.auditForm(orderNo, userName, orderType, model);
        }
        if("交施工费".equals(stepName)){
            path = payController.payForm(orderNo, model);
        }
        return path;
    }

}
