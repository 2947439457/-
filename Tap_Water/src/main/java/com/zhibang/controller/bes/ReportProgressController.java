package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reportProgress")
public class ReportProgressController {

    @RequestMapping("/beReportProgress")
    public String beOrder(){
        return "/page/be_reportProgress";
    }

}
