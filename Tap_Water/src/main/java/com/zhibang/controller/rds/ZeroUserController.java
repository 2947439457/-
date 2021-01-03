package com.zhibang.controller.rds;

import com.zhibang.service.rdService.ZeroUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ZeroUserController
 * @Description
 * @createTime 2020/12/19 14:27
 **/
@Controller
@RequestMapping("/rd")
public class ZeroUserController {
    @Autowired
    public ZeroUserService zeroUserService;//零吨位用户
    //跳转到零吨位用户
    @RequestMapping("/zeroUser")
    public String zeroUser(Model model){
        List<Map<String,Object>> reads = zeroUserService.selectZeroUser();
        System.out.println(reads);
        model.addAttribute("read",reads);
        return "page/rd_reportZero";
    }

    @RequestMapping(value = "/zeroUsers", method = RequestMethod.GET)
    public String zeroUser(Model model, String qTime, String hTime, String areaName,@Param("audit") String audit){
        List<Map<String,Object>> reads = zeroUserService.selectZeroUsers(qTime,hTime,areaName,audit);
        model.addAttribute("read",reads);
        return "/page/rd_reportZero";
    }
}
