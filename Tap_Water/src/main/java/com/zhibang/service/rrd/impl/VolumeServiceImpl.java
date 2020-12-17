package com.zhibang.service.rrd.impl;

import com.zhibang.mapper.rd.VolumeMapper;
import com.zhibang.model.RdVolume;
import com.zhibang.service.rrd.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 罗恒煌
 * @ClassName VolumeServiceImpl
 * @Description 表册
 * @createTime 2020/12/17 14:56
 **/
@Service
public class VolumeServiceImpl implements VolumeService {

    @Autowired
    public VolumeMapper volumeMapper;//表册表

    @Override
    public List<RdVolume> QueryAllVolume() {

        return volumeMapper.QueryAllVolume();
    }
}
