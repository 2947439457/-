package com.zhibang.controller.rds;

import com.zhibang.service.rdService.MeterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName MeteUserController
 * @Description
 * @createTime 2020/12/19 14:27
 **/
@Controller
@RequestMapping("/rd")
public class MeteUserController {
    @Autowired
    public MeterUserService meterUserService;//水表周检
    //水表周检；
    @RequestMapping("/meteUser")
    public String meteUser(Model model){
        List<Map<String,Object>> meteUsers = meterUserService.selectMeterUser();
        int ages = meterUserService.stMuAge();
        model.addAttribute("meteUser",meteUsers);
        model.addAttribute("age",ages);
        return "/page/rd_reportMeterCheck";
    }
}
