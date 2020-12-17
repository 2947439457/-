package com.zhibang.controller.beController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/be")
public class ReportProgressController {

    //跳转业扩工程进度页面:xxy
    @RequestMapping("/reportProgress")
    public String beOrder(){
        return "/page/be_reportProgress";
    }

}
