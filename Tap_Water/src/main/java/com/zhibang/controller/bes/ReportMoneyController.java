package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/be")
public class ReportMoneyController {

    //跳转到工单管理
    @RequestMapping("/reportMoney")
    public String beReportMoney(){
        return "/page/be_reportMoney";
    }

}
