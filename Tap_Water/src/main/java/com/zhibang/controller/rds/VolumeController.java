package com.zhibang.controller.rds;

import com.zhibang.model.RdVolume;
import com.zhibang.model.SyArea;
import com.zhibang.model.UsMeter;
import com.zhibang.model.UsUser;
import com.zhibang.service.rdService.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String volume(Model model) {

        System.out.println("-----------/volume_default-----------");

        //获取用户和表身码信息
        List<UsUser> maps = volumeService.queryAllVolume_Default();
        //获取所有辖区名称
        List<SyArea> syAreas = volumeService.queryAllArea();
        //获取辖区中的表册名
        List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
        //Test：打印数据
        System.out.println("获取用户和表身码信息" + maps);
        System.out.println("获取所有辖区名称" + syAreas);
        System.out.println("获取辖区中的表册名" + rdVolumes);


        //向前端携带数据：
        //用户和表身码信息
        model.addAttribute("rd_Volume_Default", maps);
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);
        //辖区中的表册名
        model.addAttribute("rd_VolumeName", rdVolumes);
        //状态
        String Volume_stat="未分配";
        model.addAttribute("Volume_stat",Volume_stat);

        return "/page/rd_volume";
    }

    /**
     * 跳转到添加表册界面
     *
     * @return
     */
    @RequestMapping("/volume_add")
    public String requestVolumeAdd(Model model) {
        String stat ="添加";
        //获取所有辖区名称
        List<SyArea> syAreas = volumeService.queryAllArea();
        System.out.println(syAreas);
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);
        model.addAttribute("stat",stat);
        return "/page/rd_volume_add";
    }

    /**
     * 添加表册
     *
     * @param volumeName
     * @param areaId
     * @param remark
     * @return
     */
    @PostMapping("/volume_add_insert")
    public String insertVolumeAdd(Model model, @RequestParam("volumeName") String volumeName, @RequestParam("areaId") Integer areaId, @RequestParam("remark") String remark) {
        System.out.println("---------/volume_add_insert-------------");
        System.out.println(volumeName);
        System.out.println(areaId);
        System.out.println(remark);
        String stat ="添加";
        int rdVolume = volumeService.insertVoulme(volumeName, areaId, remark);


        //跳转到添加表册界面
        System.out.println("rdVolume表册" + rdVolume);

        List<SyArea> syAreas = volumeService.queryAllArea();
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);
        model.addAttribute("stat", stat);
        return "/page/rd_volume_add";
    }

    /**
     * 删除表册(实则修改表册--状态改变)
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/rd_volume_update_stat")
    public String updateVoulme(Model model,@RequestParam("id") Integer id) {
        int i = volumeService.updateVolume_stat(id);
        System.out.println("I"+i);
        System.out.println("-----------/volume_default-----------");
        //获取用户和表身码信息
        List<UsUser> maps = volumeService.queryAllVolume_Default();
        //获取所有辖区名称
        List<SyArea> syAreas = volumeService.queryAllArea();
        //获取辖区中的表册名
        List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
        //Test：打印数据
        System.out.println("获取用户和表身码信息" + maps);
        System.out.println("获取所有辖区名称" + syAreas);
        System.out.println("获取辖区中的表册名" + rdVolumes);


        //向前端携带数据：
        //用户和表身码信息
        model.addAttribute("rd_Volume_Default", maps);
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);
        //辖区中的表册名
        model.addAttribute("rd_VolumeName", rdVolumes);
        //状态
        String Volume_stat="未分配";
        model.addAttribute("Volume_stat",Volume_stat);

        return "/page/rd_volume";
    }

    /**
     * 修改表册跳的界面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/rd_volume_query_Id")
    public String queryByIDRdVolume(Model model,@RequestParam("id") Integer id){
        String stat ="修改";
        System.out.println("queryByIDRdVolume中的ID"+id);

        RdVolume rdVolume = volumeService.queryByIDRdVolume(id);
        System.out.println(rdVolume);


        List<SyArea> syAreas = volumeService.queryAllArea();
        System.out.println(syAreas);
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);

        model.addAttribute("rd_Volume_update", rdVolume);

        model.addAttribute("stat",stat);

        return "/page/rd_volume_add";
    }

    /**
     * 修改表册信息
     * @param model
     * @param volumeName
     * @param areaId
     * @param remark
     * @param ID
     * @return
     */
    @PostMapping("/volume_add_update")
    public String updateVolume(Model model, @RequestParam("volumeName") String volumeName,
                               @RequestParam("areaId") Integer areaId,
                               @RequestParam("remark") String remark,
                               @RequestParam("ID") Integer ID){
        int i = volumeService.updateVolume(volumeName, areaId, remark, ID);
        System.out.println("volume_add_update中的I"+i);

        //获取用户和表身码信息
        List<UsUser> maps = volumeService.queryAllVolume_Default();
        //获取所有辖区名称
        List<SyArea> syAreas = volumeService.queryAllArea();
        //获取辖区中的表册名
        List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
        //Test：打印数据
        System.out.println("获取用户和表身码信息" + maps);
        System.out.println("获取所有辖区名称" + syAreas);
        System.out.println("获取辖区中的表册名" + rdVolumes);


        //向前端携带数据：
        //用户和表身码信息
        model.addAttribute("rd_Volume_Default", maps);
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);
        //辖区中的表册名
        model.addAttribute("rd_VolumeName", rdVolumes);

        return "/page/rd_volume";


    }

    /**
     * 查询所属辖区信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/volume_parm")
    public String queryAllVolume_Param(Model model,@RequestParam("ID")Integer id ,@RequestParam("stat") String stat){
        System.out.println("--------/volume_parm-----------");
        System.out.println("stat"+stat);
        List<UsUser> usUsers = volumeService.queryAllVolume_Param(id);
        //获取所有辖区名称
        List<SyArea> syAreas = volumeService.queryAllArea();
        //获取辖区中的表册名
        List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
        //Test：打印数据
        System.out.println("获取用户和表身码信息" + usUsers);
        System.out.println("获取所有辖区名称" + syAreas);
        System.out.println("获取辖区中的表册名" + rdVolumes);

        model.addAttribute("rd_Volume_Default", usUsers);
        //所有辖区名称
        model.addAttribute("rd_AreaName", syAreas);
        //辖区中的表册名
        model.addAttribute("rd_VolumeName", rdVolumes);
        //状态
        String Volume_stat=stat;
        model.addAttribute("Volume_stat",Volume_stat);

        System.out.println(usUsers);
        return "/page/rd_volume";
    }


    @RequestMapping("/volume_area")
    public String updateVolume_area(Model model,@RequestParam("ID")Integer ID,
                                    @RequestParam("str")String str,
                                    @RequestParam("stat")String stat){
        System.out.println(ID);
        System.out.println(str);
        String[] split = str.split(",");
        for (int i = 0; i <split.length ; i++) {
            if (ID==0){
                int n = volumeService.updateVolume_area(null, split[i]);

                System.out.println("----------");
                //获取用户和表身码信息
                List<UsUser> maps = volumeService.queryAllVolume_Default();
                //获取所有辖区名称
                List<SyArea> syAreas = volumeService.queryAllArea();
                //获取辖区中的表册名
                List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
                //Test：打印数据
                System.out.println("获取用户和表身码信息" + maps);
                System.out.println("获取所有辖区名称" + syAreas);
                System.out.println("获取辖区中的表册名" + rdVolumes);


                //向前端携带数据：
                //用户和表身码信息
                model.addAttribute("rd_Volume_Default", maps);
                //所有辖区名称
                model.addAttribute("rd_AreaName", syAreas);
                //辖区中的表册名
                model.addAttribute("rd_VolumeName", rdVolumes);
                //状态
                String Volume_stat="未分配";
                model.addAttribute("Volume_stat",Volume_stat);

            }else{
                int n = volumeService.updateVolume_area(ID, split[i]);

                System.out.println("stat"+stat);
                List<UsUser> usUsers = volumeService.queryAllVolume_Param(ID);
                //获取所有辖区名称
                List<SyArea> syAreas = volumeService.queryAllArea();
                //获取辖区中的表册名
                List<RdVolume> rdVolumes = volumeService.queryAllVolumeName();
                //Test：打印数据
                System.out.println("获取用户和表身码信息" + usUsers);
                System.out.println("获取所有辖区名称" + syAreas);
                System.out.println("获取辖区中的表册名" + rdVolumes);

                model.addAttribute("rd_Volume_Default", usUsers);
                //所有辖区名称
                model.addAttribute("rd_AreaName", syAreas);
                //辖区中的表册名
                model.addAttribute("rd_VolumeName", rdVolumes);
                //状态
                String Volume_stat=stat;
                model.addAttribute("Volume_stat",Volume_stat);
            }


//            System.out.println("volume_area------------------"+n);
        }



        return "/page/rd_volume";
    }





}
