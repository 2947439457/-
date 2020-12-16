package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reportMoney")
public class ReportMoneyController {

    //跳转到工单管理
    @RequestMapping("/beReportMoney")
    public String beReportMoney(){
        return "/page/be_reportMoney";
    }

}
