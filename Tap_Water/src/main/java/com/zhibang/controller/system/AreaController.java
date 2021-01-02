package com.zhibang.controller.system;

import com.zhibang.model.SyArea;
import com.zhibang.service.system.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class AreaController {
    @Autowired
    AreaService areaService;
    /**
     * 查询所有抄表辖区的方法YX
     * @param model
     * @return
     */
    @RequestMapping("/sys_area")
    public String sysarea(Model model){
        List<SyArea> syArea = areaService.selectSyArea();
        model.addAttribute("area",syArea);
        System.out.println("查询全部");
        System.out.println(syArea);
        return "page/sys_area";
    }
    /**
     * 删除方法
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/delArea")
    public String delArea(@RequestParam("deid") Integer id, Model model){
        Integer i = areaService.delSyArea(id);
        System.out.println(i);
        List<SyArea> syArea = areaService.selectSyArea();
        model.addAttribute("area",syArea);
        return "page/sys_area";
    }
    /**
     * 跳转
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/sys_area_add")
    public String sys_area_add(@RequestParam(value = "area",required = false, defaultValue = "0") Integer id,Model model){
        if(id.equals(0)||id==0){
            System.out.println("进入增加界面");
            return "page/sys_area_add";
        }
        SyArea syArea = areaService.selectSyAreaID(id);
        model.addAttribute("syArea",syArea);
        return "page/sys_area_add";
    }
    /**
     * 修改
     * @param id
     * @param name
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("/updateArea")
    public String sdf(@RequestParam("arid") Integer id,
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
            SyArea syArea1 = new SyArea();
            syArea1.setId(id);
            syArea1.setAreaName(name);
            syArea1.setRemark(remark);
            Integer s = areaService.updateSyArea(syArea1);
            if(s==1){ System.out.println("成功"); }
        }
        List<SyArea> syArea = areaService.selectSyArea();
        model.addAttribute("area",syArea);
        return "page/sys_area";
    }
    /**
     * 添加方法
     * @param name
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("/addArea")
    public String addArea(@RequestParam("lname") String name,
                          @RequestParam("description") String remark,
                          Model model){
        System.out.println(name);
        System.out.println("在");
        System.out.println(remark);
        SyArea Area = new SyArea();
        Area.setAreaName(name);
        Area.setRemark(remark);
        Integer i = areaService.addSyArea(Area);
        System.out.println(i);
        List<SyArea> syArea = areaService.selectSyArea();
        model.addAttribute("area",syArea);
        return "page/sys_area";
    }




}
