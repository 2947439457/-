package com.zhibang.controller.system;

import com.zhibang.model.*;
import com.zhibang.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SystemController {
    @Autowired  SystemService systemService;

    /**
     * 登录验证方法YX
     * @param email
     * @param password
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/saveCreateDb")
//    @ResponseBody
    public String yourUrl(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpServletRequest request)  {
        System.out.println("email="+email+";password="+password);
        SyEmp syEmp = new SyEmp();
        syEmp.setEmpNo(email);
        syEmp.setPwd(password);
        SyEmp i = systemService.selectEepById(syEmp);


        if(i==null){
            model.addAttribute("asdgf","账号密码不记得？");
            return "login";
        }
//        model.addAttribute("s",i);
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("s", i);
//        request.setAttribute("s",i);
        return "workspace";
    }

    /**
     * 查询所有抄表辖区的方法
     * @param model
     * @return
     */
    @RequestMapping("/sys_area")
    public String sysarea(Model model){
        List<SyArea> syArea = systemService.selectSyarea();
        model.addAttribute("area",syArea);
        return "page/sys_area";
    }

    /**
     * 查询所有水表型号
     * @param model
     * @return
     */
    @RequestMapping("/sys_meterType")
    public String sys_meterType(Model model){
        List<SyMetertype> syMetertype = systemService.selectSyMetertype();
        model.addAttribute("syMetertype",syMetertype);
        return "page/sys_meterType";
    }

    /**
     * 查询所有部门
     * @param model
     * @return
     */
    @RequestMapping("/sys_dept")
    public String sys_dept(Model model){
        List<SyDept> syDept = systemService.selectSyDept();
        model.addAttribute("syDept",syDept);
        return "page/sys_dept";
    }

    /**
     * 查询所有员工
     * @param model
     * @return
     */
    @RequestMapping("/sys_emp")
    public String sys_emp(Model model){
        List<SyEmp> syEmp = systemService.selectSyEmp();
        model.addAttribute("syEmp",syEmp);
        return "/page/sys_emp";
    }

    /**
     * 查询
     * @param model
     * @return
     */
    @RequestMapping("/sys_menupower")
    public String sys_menupower(Model model){
        List<SyEmp> syEmp = systemService.selectSyEmp();
        model.addAttribute("syEmp",syEmp);
        return "/page/sys_menupower";
    }
    @RequestMapping("/sys_areapower")
    public String sys_areapower(Model model){
        List<SyEmp> syEmp = systemService.selectSyEmp();
        model.addAttribute("syEmp",syEmp);
        return "/page/sys_areapower";
    }

    /**
     * 查询用水类型
     * @param model
     * @return
     */
    @RequestMapping("/sys_waterType")
    public String sys_waterType(Model model){
        List<SyCosttype> syCosttypes = systemService.selectSyCosttype(0);
        model.addAttribute("syCosttypes",syCosttypes);
        return "/page/sys_waterType";
    }
    @RequestMapping("/sys_surcharge")
    public String sys_surcharge(Model model){
        List<SyCosttype> syCosttypes = systemService.selectSyCosttype(1);
        model.addAttribute("syCosttypes",syCosttypes);
        return "/page/sys_surcharge";
    }
    @RequestMapping("/sys_flow")
    public String sys_flow(Model model){
        List<BeFlow> beFlows = systemService.selectBeFlow();
        model.addAttribute("beFlows",beFlows);
        return  "/page/sys_flow";
    }
//    @RequestMapping("sys_waterType")
//    public String sys_waterType(Model model){
//        return "/page/sys_waterType";
//    }

}
