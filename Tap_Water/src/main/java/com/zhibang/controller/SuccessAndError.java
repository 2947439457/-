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
 * @Description TODO
 * @createTime 2020年12月23日 16:30:00
 */
@Controller
public class SuccessAndError {

    @RequestMapping("/success")
    public String success(){
        return "/page/success";
    }

    @RequestMapping("/success/{stat}/{winPage}")
    public String success(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage, HttpSession httpSession){
        String success = success(stat, winPage, null, null, httpSession);
        return success;
    }

    @RequestMapping("/success/{stat}/{winPage}/{stepId}")
    public String success(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage,
                          @PathVariable("stepId") String stepId, HttpSession httpSession){
        String success = success(stat, winPage, stepId, null, httpSession);
        return success;
    }

    //跳转成功界面：yjh
    @RequestMapping("/success/{stat}/{winPage}/{stepId}/{orderType}")
    public String success(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage,
                          @PathVariable("stepId") String stepId, @PathVariable("orderType") String orderType, HttpSession httpSession) {
        String path = "";
        if (stat != null && winPage != null && stepId != null && orderType != null){
            path = stat+"/"+winPage+"?stepId="+stepId+"&orderType="+orderType;
        }else if (stat != null && winPage != null && stepId != null){
            path = stat+"/"+winPage+"?stepId="+stepId;
        }else if (stat != null && winPage != null){
            path = stat+"/"+winPage;
        }
        httpSession.setAttribute("path", path);
        return "redirect:/success";
    }

    @RequestMapping("/error")
    public String error(){
        return "/page/error";
    }

    @RequestMapping("/error/{stat}/{winPage}")
    public String error(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage,HttpSession httpSession){
        String error = error(stat, winPage, null, null, httpSession);
        return error;
    }

    @RequestMapping("/error/{stat}/{winPage}/{stepId}")
    public String error(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage,
                        @PathVariable("stepId") String stepId, HttpSession httpSession){
        String error = error(stat, winPage, stepId, null, httpSession);
        return error;
    }

    //跳转失败界面：yjh
    @RequestMapping("/error/{stat}/{winPage}/{stepId}/{orderType}")
    public String error(@PathVariable("stat") String stat, @PathVariable("winPage") String winPage,
                          @PathVariable("stepId") String stepId, @PathVariable("orderType") String orderType, HttpSession httpSession){
        String path = "";
        if (stat != null && winPage != null && stepId != null && orderType != null){
            path = stat+"/"+winPage+"?stepId="+stepId+"&orderType="+orderType;
        }else if (stat != null && winPage != null && stepId != null){
            path = stat+"/"+winPage+"?stepId="+stepId;
        }else if (stat != null && winPage != null){
            path = stat+"/"+winPage;
        }
        httpSession.setAttribute("path", path);
        return "redirect:/error";
    }

}
