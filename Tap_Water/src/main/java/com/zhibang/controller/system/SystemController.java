package com.zhibang.controller.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyDept;
import com.zhibang.model.SyEmp;
import com.zhibang.model.SyMetertype;
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
        SyDept syDept = systemService.selectEepById(syEmp).getDeptId();
        System.out.println(syDept);
        i.setDeptId(syDept);

        System.out.println(i);
        if(i==null){
            model.addAttribute("asdgf","账号密码不记得？");
            return "login";
        }
//        model.addAttribute("s",i);
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("s", i);
//        request.setAttribute("s",i);
        System.out.println(i);
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
        System.out.println(syArea);
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
        System.out.println(syMetertype);
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
        System.out.println(syDept);
        return "page/sys_dept";
    }
    @RequestMapping("/sys_emp")
    public String sys_emp(Model model){
        List<SyEmp> syEmp = systemService.selectSyEmp();
        model.addAttribute("syEmp",syEmp);
        System.out.println();
        return "/page/sys_emp";
    }
}
