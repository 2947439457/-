package com.zhibang.controller.rds;

import com.zhibang.service.rdService.ZeroUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String zeroUser(Model model, String qTime){
        List<Map<String,Object>> reads = zeroUserService.selectZeroUser();
        System.out.println(reads);

        model.addAttribute("read",reads);
        return "page/rd_reportZero";
    }
}
