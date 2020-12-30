package com.zhibang.service.rrd.impl;

import com.zhibang.mapper.rd.VolumeMapper;
import com.zhibang.model.RdVolume;
import com.zhibang.model.SyArea;
import com.zhibang.model.UsMeter;
import com.zhibang.model.UsUser;
import com.zhibang.service.rrd.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName VolumeServiceImpl
 * @Description 表册
 * @createTime 2020/12/17 14:56
 **/
@Service
public class VolumeServiceImpl implements VolumeService{

    @Autowired
    public VolumeMapper volumeMapper;//表册表

    //查询所有表册信息：默认查询未分配用户
    @Override
    public List<UsUser> queryAllVolume_Default() {
        List<UsUser> usMeters = volumeMapper.queryAllVolume_Default();
        return  usMeters;
    }


    //查询所有表册信息：依据所属辖区查询用户
    @Override
    public List<UsUser> queryAllVolume_Param(String volumeID) {
        List<UsUser> usMeters = volumeMapper.queryAllVolume_Param(volumeID);
        return usMeters;
    }

    //查询所有辖区
    @Override
    public List<SyArea> queryAllArea() {
        List<SyArea> syAreas = volumeMapper.queryAllArea();
        return syAreas;
    }

    //查询所有辖区中的表册名
    @Override
    public List<RdVolume> queryAllVolumeName() {
        List<RdVolume> rdVolumes = volumeMapper.queryAllVolumeName();
        return rdVolumes;
    }
}
