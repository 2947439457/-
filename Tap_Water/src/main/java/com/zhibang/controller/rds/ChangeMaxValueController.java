package com.zhibang.controller.rds;

import com.zhibang.model.SyEmp;
import com.zhibang.service.rdService.ChangeMaxValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ChangeMaxValueController
 * @Description
 * @createTime 2020/12/19 14:29
 **/
@Controller
@RequestMapping("/rd")
public class ChangeMaxValueController {
    @Autowired
    public ChangeMaxValueService changeMaxValueService;//最大码
    //跳转到最大码
    @RequestMapping("/changeMaxValue")
    public String changeMaxValue(Model model){
        List<Map<String,Object>> changeMaxValues = changeMaxValueService.selectMaxValue();
        List<SyEmp> empNames = changeMaxValueService.selEmpName();
        System.out.println(changeMaxValues);
        model.addAttribute("changeMaxValue",changeMaxValues);
        model.addAttribute("empName",empNames);
        return "/page/rd_reportMaxValue";
    }
}
