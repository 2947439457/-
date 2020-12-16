package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    //跳转到工单管理
    @RequestMapping("/beOrder")
    public String beOrder(){
        return "/page/be_order";
    }

    //跳转到初步审核
    @RequestMapping("/auditForm")
    public String auditForm(){
        return "/page/be__auditForm";
    }

    //跳转到档案存档
    @RequestMapping("/saveForm")
    public String saveForm(){
        return "/page/be__saveForm";
    }

    //跳转到供水协议
    @RequestMapping("/beContractForm")
    public String contractForm(){
        return "/page/be__contractForm";
    }


}
