package com.zhibang.controller.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyMetertype;
import com.zhibang.service.system.MeterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MeterTypeController {
    @Autowired
    MeterTypeService meterTypeService;
    /**
     * 查询所有水表型号YX
     * @param model
     * @return
     */
    @RequestMapping("/sys_meterType")
    public String sys_meterType(Model model){
        List<SyMetertype> syMetertype = meterTypeService.selectSyMeterType();
        model.addAttribute("syMetertype",syMetertype);
        System.out.println(syMetertype);
        return "page/sys_meterType";
    }
    /**
     * 删除方法
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/delsyMetertype")
    public String delsyMetertype(@RequestParam("deid") Integer id, Model model){
        Integer i = meterTypeService.delSyMeterType(id);
        System.out.println(i);
        List<SyMetertype> syMetertype = meterTypeService.selectSyMeterType();
        model.addAttribute("syMetertype",syMetertype);
        return "page/sys_meterType";
    }
    /**
     * 跳转
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/sys_meterType_add")
    public String sys_meterType_add(@RequestParam(value = "meterType",required = false, defaultValue = "0") Integer id, Model model){
        if(id.equals(0)||id==0){
            System.out.println("进入增加界面");
            return "page/sys_meterType_add";
        }
        model.addAttribute("id",id);
        return "page/sys_meterType_add";
    }

    /**
     * 修改
     * @param id
     * @param name
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("/updatemeterType")
    public String updatemeterType(@RequestParam("meterid") Integer id,
                      @RequestParam("lname") String name,
                      @RequestParam("lname1") Integer name1,
                      @RequestParam("lname2") Integer name2,
                      @RequestParam("lname3") Integer name3,
                      @RequestParam("lname4") Integer name4,
                      @RequestParam("description") String remark,
                      Model model){
        System.out.println(id);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(remark);
        System.out.println("进入了修改方法");

        if(name.equals("")||name==null){
            System.out.println("没有修改");
        }else {
            SyMetertype syMetertypes = new SyMetertype();
            syMetertypes.setId(id);
            syMetertypes.setMeterTypeName(name);
            syMetertypes.setAperture(name1);
            syMetertypes.setMavValue(name2);
            syMetertypes.setMinValue(name3);
            syMetertypes.setLife(name4);
            syMetertypes.setRemark(remark);
            Integer s = meterTypeService.updateSyMeterType(syMetertypes);
            if(s==1){ System.out.println("成功"); }
        }
        List<SyMetertype> syMetertype = meterTypeService.selectSyMeterType();
        model.addAttribute("syMetertype",syMetertype);
        return "page/sys_meterType";
    }
    /**
     * 添加方法
     * @param name
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("/addmeterType")
    public String addmeterType(@RequestParam("lname") String name,
                          @RequestParam("lname1") Integer name1,
                          @RequestParam("lname2") Integer name2,
                          @RequestParam("lname3") Integer name3,
                          @RequestParam("lname4") Integer name4,
                          @RequestParam("description") String remark,
                          Model model){
        System.out.println("添加方法");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(remark);
        SyMetertype syMetertypes = new SyMetertype();
        syMetertypes.setMeterTypeName(name);
        syMetertypes.setAperture(name1);
        syMetertypes.setMavValue(name2);
        syMetertypes.setMinValue(name3);
        syMetertypes.setLife(name4);
        syMetertypes.setRemark(remark);
        Integer i = meterTypeService.addSyMeterType(syMetertypes);
        System.out.println(i);
        List<SyMetertype> syMetertype = meterTypeService.selectSyMeterType();
        model.addAttribute("syMetertype",syMetertype);
        return "page/sys_meterType";
    }


}
