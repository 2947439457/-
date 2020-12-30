package com.zhibang.controller.rds;

import com.zhibang.service.rdService.ChangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ChangeValueController
 * @Description
 * @createTime 2020/12/19 14:28
 **/
@Controller
@RequestMapping("/rd")
public class ChangeValueController {
    @Autowired
    public ChangeValueService changeValueService;//底码
    //跳转到底码
    @RequestMapping("/changeValue")
    public String changeValue(Model model){
        List<Map<String,Object>> changeValues = changeValueService.selectValue();
        System.out.println(changeValues);
        model.addAttribute("changeValue",changeValues);
        return "/page/rd_reportCPreAmount";
    }
}
