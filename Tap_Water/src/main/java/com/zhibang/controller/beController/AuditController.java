package com.zhibang.controller.beController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    //跳转初步审核界面:yjh
    @GetMapping("/audit")
    public String Audit(){
        return "/page/be__audit";
    }

    //跳转初步审核处理界面:yjh
    @GetMapping("/auditForm")
    public String auditForm(){
        return "/page/be__auditForm";
    }

}
