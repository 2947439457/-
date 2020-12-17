package com.zhibang.controller.rds;

import com.zhibang.model.RdVolume;
import com.zhibang.service.rrd.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    //跳转到表册
    @RequestMapping("/volume")
    public String volume(Model model){
        List<RdVolume> rdVolumes = volumeService.QueryAllVolume();
        System.out.println(rdVolumes);
        model.addAttribute("s",rdVolumes);
        return "/page/rd_volume";
    }



}
