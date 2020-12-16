package com.zhibang.controller.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyEmp;
import com.zhibang.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SystemController {
    @Autowired  SystemService systemService;

    @RequestMapping("/saveCreateDb")
//    @ResponseBody
    public String yourUrl(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        System.out.println("email="+email+";password="+password);
        SyEmp syEmp = new SyEmp();
        syEmp.setEmpNo(email);
        syEmp.setPwd(password);
        SyEmp i = systemService.selectEepById(syEmp);
        System.out.println(i);
        if(i==null){
            model.addAttribute("asdgf","账号密码不记得？");
            return "login";
        }
        model.addAttribute("s",i);
        System.out.println(i);
        return "workspace";
    }
    @RequestMapping("/sys_area")
    public String sys_area(Model model){
        List<SyArea> syArea = systemService.selectSy_area();
        model.addAttribute("area",syArea);
        System.out.println(syArea);
        return "page/sys_area";
    }
}
