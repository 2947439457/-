package com.zhibang.controller.beController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PayContorller.java
 * @Description TODO 交施工费
 * @createTime 2020年12月16日 01:26:00
 */
@Controller
@RequestMapping("/be")
public class PayController {

    //跳转交施工费页面:yjh
    @GetMapping("/pay")
    public String pay(){
        return "/page/be__pay";
    }

    //跳转交施工费处理页面:yjh
    @GetMapping("/payForm")
    public String payForm(){
        return "/page/be__payForm";
    }

}
