package com.zhibang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SuccessAndError.java
 * @Description TODO 成功与失败界面
 * @createTime 2020年12月23日 16:30:00
 */
@Controller
public class SuccessAndError {

    @RequestMapping("/success")
    public String success(){
        return "/page/success";
    }

    //跳转成功界面：yjh
    @RequestMapping("/success/{stat}/{winPage}")
    public String success(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage, HttpSession httpSession) {
        String path = stat+"/"+winPage;;
        httpSession.setAttribute("path", path);
        return "redirect:/success";
    }

    @RequestMapping("/error")
    public String error(){
        return "/page/error";
    }

    //跳转失败界面：yjh
    @RequestMapping("/error/{stat}/{winPage}")
    public String error(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage, HttpSession httpSession){
        String path = stat+"/"+winPage;;
        httpSession.setAttribute("path", path);
        return "redirect:/error";
    }

}
