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


        System.out.println(i);
        if(i==null){
            model.addAttribute("asdgf","账号密码不记得？");
            return "login";
        }
        if(i.getDeptId().getId()==1){
            model.addAttribute("s1","block");
            model.addAttribute("s2","block");
            model.addAttribute("s3","block");
            model.addAttribute("s4","block");
            model.addAttribute("s5","block");
            model.addAttribute("s6","block");
        }else if(i.getDeptId().getId()==2){
            model.addAttribute("s1","block");
            model.addAttribute("s2","none");
            model.addAttribute("s3","none");
            model.addAttribute("s4","none");
            model.addAttribute("s5","none");
            model.addAttribute("s6","none");
        } else if(i.getDeptId().getId()==3){
            model.addAttribute("s1","none");
            model.addAttribute("s2","none");
            model.addAttribute("s3","none");
            model.addAttribute("s4","block");
            model.addAttribute("s5","block");
            model.addAttribute("s6","none");
        } else if(i.getDeptId().getId()==4){
            model.addAttribute("s1","none");
            model.addAttribute("s2","none");
            model.addAttribute("s3","none");
            model.addAttribute("s4","block");
            model.addAttribute("s5","block");
            model.addAttribute("s6","none");
        } else if(i.getDeptId().getId()==5){
            model.addAttribute("s1","none");
            model.addAttribute("s2","none");
            model.addAttribute("s3","block");
            model.addAttribute("s4","none");
            model.addAttribute("s5","none");
            model.addAttribute("s6","none");
        } else if(i.getDeptId().getId()==6){
            model.addAttribute("s1","block");
            model.addAttribute("s2","none");
            model.addAttribute("s3","block");
            model.addAttribute("s4","block");
            model.addAttribute("s5","block");
            model.addAttribute("s6","none");
        } else if(i.getDeptId().getId()==7){
            model.addAttribute("s1","block");
            model.addAttribute("s2","none");
            model.addAttribute("s3","none");
            model.addAttribute("s4","none");
            model.addAttribute("s5","none");
            model.addAttribute("s6","none");
        }else {
            model.addAttribute("s1","none");
            model.addAttribute("s2","none");
            model.addAttribute("s3","none");
            model.addAttribute("s4","none");
            model.addAttribute("s5","none");
            model.addAttribute("s6","none");
        }

        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("s", i);
//        request.setAttribute("s",i);
        System.out.println(i);
        return "workspace";
    }
    @RequestMapping("/sys_pwd")
    public String sys_pwd(){

        return "page/sys_pwd";
    }
    @RequestMapping(value = "/sssd",produces = {"application/text;charset=UTF-8"})
    public String sys_pwds(@RequestParam("fname") String name,
                           @RequestParam("lname") String pas,
                           @RequestParam("lname1") String pas1,
                           @RequestParam("lname2") String pas2,Model model){
        if((pas==null||pas.equals(""))
                &&(pas1==null||pas.equals(""))){
            model.addAttribute("banduan", "密码未输入,新密码未输入");
            return "page/sys_pwd";
        }else if(pas.equals(null)||pas.equals("")){
            model.addAttribute("tishi", "密码未输入");
            return "page/sys_pwd";
        }else if(pas.length()<6||pas.length()>8){
            model.addAttribute("tishi","密码长度应为6到8");
            return "page/sys_pwd";
        }else if (pas1==null||pas2==null) {
            model.addAttribute("banduan", "新密码未输入");
            return "page/sys_pwd";
        }else if(pas1.length()<6||pas1.length()>8){
            model.addAttribute("tishi","新密码长度应为6到8");
            return "page/sys_pwd";
        }else if (pas1.equals(pas2)!=true) {
            model.addAttribute("banduan", "新密码输入出错");
            return "page/sys_pwd";
        }
        SyEmp syEmp = new SyEmp();
        syEmp.setEmpName(name);
        syEmp.setPwd(pas);
        System.out.println(syEmp);
        SyEmp syEmps = systemService.selectSyEmps(syEmp);
        if(syEmps!=null){
        }else {
            model.addAttribute("tishi","密码输入不正确");
            return "page/sys_pwd";
        }
        System.out.println(pas);
        System.out.println(pas1);
        System.out.println(pas2);
        System.out.println(syEmps);
        SyEmp syEmp1 = new SyEmp();
        syEmp1.setEmpName(syEmp.getEmpName());
        syEmp1.setPwd(pas1);
        Integer syEp1 = systemService.updateSyEmp(syEmp1);
        System.out.println(syEmp1);
        if(syEp1==0){

        }else {
            System.out.println("成功");
        }

        return "/login";
    }


    /**
     * 查询所有部门YX
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

    /**
     * 查询所有员工YX
     * @param model
     * @return
     */
    @RequestMapping("/sys_emp")
    public String sys_emp(Model model){
        List<SyEmp> syEmp = systemService.selectSyEmp();
        System.out.println(syEmp);
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
        System.out.println(syEmp);
        model.addAttribute("syEmp",syEmp);
        return "/page/sys_menupower";
    }
    @RequestMapping("/sys_areapower")
    public String sys_areapower(Model model){
        List<SyEmp> syEmp = systemService.selectSyEmp();
        System.out.println(syEmp);
        model.addAttribute("syEmp",syEmp);
        return "/page/sys_areapower";
    }

    /**
     * 查询用水类型YX
     * @param model
     * @return
     */
    @RequestMapping("/sys_waterType")
    public String sys_waterType(Model model){
        List<SyCosttype> syCosttypes = systemService.selectSyCosttype(0);
        System.out.println(syCosttypes);
        model.addAttribute("syCosttypes",syCosttypes);
        return "/page/sys_waterType";
    }

    /**
     * 查询附加费YX
     * @param model
     * @return
     */
    @RequestMapping("/sys_surcharge")
    public String sys_surcharge(Model model){
        List<SyCosttype> syCosttypes = systemService.selectSyCosttype(1);
        System.out.println(syCosttypes);
        model.addAttribute("syCosttypes",syCosttypes);
        return "/page/sys_surcharge";
    }
    @RequestMapping("/sys_flow")
    public String sys_flow(Model model){
        List<BeFlow> beFlows = systemService.selectBeFlow();
        System.out.println(beFlows);
        model.addAttribute("beFlows",beFlows);
        return  "/page/sys_flow";
    }
//    @RequestMapping("sys_waterType")
//    public String sys_waterType(Model model){
//        return "/page/sys_waterType";
//    }

}
