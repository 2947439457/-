package com.zhibang.controller.beController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/be")
public class AbortController {

    //跳转到abort页面：xxy
    @RequestMapping("/abort")
    public String beOrder(){
        return "/page/be_abort";
    }

}
