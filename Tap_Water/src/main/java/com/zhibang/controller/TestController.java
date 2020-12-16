package com.zhibang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName TestContoller.java
 * @Description TODO 测试类：在项目中没实际用途，只做测试
 * @createTime 2020年12月11日 09:29:00
 */
@Controller
public class TestController {

    @RequestMapping("/show")
    public String show(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //    @RequestMapping("/show")
    //    public String show(){
    //        return "page/be__request";
    //    }


}
