package com.zhibang.controller.system;

import com.zhibang.model.SyDept;
import com.zhibang.model.SyMetertype;
import com.zhibang.service.system.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    DeptService deptService;
    /**
     * 查询所有部门YX
     * @param model
     * @return
     */
    @RequestMapping("/sys_dept")
    public String sys_dept(Model model){
        List<SyDept> syDept = deptService.selectSyDept();
        model.addAttribute("syDept",syDept);
        System.out.println(syDept);
        return "page/sys_dept";
    }
//    /**
//     * 删除方法
//     * @param id
//     * @param model
//     * @return
//     */
//    @RequestMapping("/delsyMetertype")
//    public String delsyMetertype(@RequestParam("deid") Integer id, Model model){
//        Integer i = meterTypeService.delSyMeterType(id);
//        System.out.println(i);
//        List<SyMetertype> syMetertype = meterTypeService.selectSyMeterType();
//        model.addAttribute("syMetertype",syMetertype);
//        return "page/sys_meterType";
//    }
    /**
     * 跳转
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/sys_dept_add")
    public String sys_meterType_add(@RequestParam(value = "date",required = false, defaultValue = "0") Integer id, Model model){
        if(id.equals(0)||id==0){
            System.out.println("进入增加界面");
            return "page/sys_dept_add";
        }
        SyDept SyDept = deptService.selectSyDeptID(id);
        model.addAttribute("SyDept",SyDept);
        return "page/sys_dept_add";
    }

    /**
     * 修改
     * @param id
     * @param name
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("/updatedept")
    public String updatemeterType(@RequestParam("deptid") Integer id,
                                  @RequestParam("lname") String name,
                                  @RequestParam("description") String remark,
                                  Model model){
        System.out.println(id);
        System.out.println(name);
        System.out.println(remark);
        System.out.println("进入了修改方法");

        if(name.equals("")||name==null){
            System.out.println("没有修改");
        }else {
            SyDept syDept = new SyDept();
            syDept.setId(id);
            syDept.setDeptName(name);
            syDept.setRemark(remark);
            Integer s = deptService.updateDapt(syDept);
            if(s==1){ System.out.println("成功"); }
        }
        List<SyDept> SyDept = deptService.selectSyDept();
        model.addAttribute("syDept",SyDept);
        return "page/sys_dept";
    }
    /**
     * 添加方法
     * @param name
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("/adddept")
    public String addmeterType(@RequestParam("lname") String name,
                               @RequestParam("description") String remark,
                               Model model){
        System.out.println("添加方法");
        System.out.println(name);
        SyDept syDepts = new SyDept();
        syDepts.setDeptName(name);
        syDepts.setRemark(remark);
        Integer i = deptService.addDapt(syDepts);
        System.out.println(i);
        List<SyDept> syDept = deptService.selectSyDept();
        model.addAttribute("syDept",syDept);
        return "page/sys_dept";
    }
}

