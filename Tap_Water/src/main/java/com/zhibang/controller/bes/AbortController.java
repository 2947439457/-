package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/abort")
public class AbortController {

    @RequestMapping("/beAbort")
    public String beOrder(){
        return "/page/be_abort";
    }

}
