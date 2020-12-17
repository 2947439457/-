package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/be")
public class AbortController {

    @RequestMapping("/abort")
    public String beOrder(){
        return "/page/be_abort";
    }

}
