package com.zhibang.controller.rds;

import com.zhibang.model.RdVolume;
import com.zhibang.model.SyArea;
import com.zhibang.model.UsMeter;
import com.zhibang.model.UsUser;
import com.zhibang.service.rrd.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName VolumeController
 * @Description
 * @createTime 2020/12/17 15:00
 **/
@Controller
@RequestMapping("/rd")
public class VolumeController {

    @Autowired
    public VolumeService volumeService;//表册


    //跳转到表册（默认显示未分配用户）
    @RequestMapping("/volume_default")
    public String volume(Model model){
        //获取用户和表身码信息
        List<UsUser> maps = volumeService.queryAllVolume_Default();
        //获取所有辖区名称
        List<SyArea> syAreas = volumeService.queryAllArea();
        //获取辖区中的表册名
        List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
        //获取辖区表册所对应的用户信息
        List<UsUser> usUsers = volumeService.queryAllVolume_Param("");
        //Test：打印数据
        System.out.println("获取用户和表身码信息"+maps);
        System.out.println("获取所有辖区名称"+syAreas);
        System.out.println("获取辖区中的表册名"+rdVolumes);


        //向前端携带数据：
            //用户和表身码信息
        model.addAttribute("rd_Volume_Default",maps);
            //所有辖区名称
        model.addAttribute("rd_AreaName",syAreas);
            //辖区中的表册名
        model.addAttribute("rd_VolumeName",rdVolumes);

        return "/page/rd_volume";
    }



}
