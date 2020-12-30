package com.zhibang.service.rdService.impl;

import com.zhibang.service.rdService.MeterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName MeterUserServiceImpl
 * @Description 水表周检报表
 * @createTime 2020/12/12 18:03
 **/
@Service
public class MeterUserServiceImpl implements MeterUserService {

    @Autowired
    public com.zhibang.mapper.rdMapper.MeterUserMapper MeterUserMapper;//水表周检

    //查询周检表数据
    @Override
    public List<Map<String,Object>> selectMeterUser(){

        return MeterUserMapper.selectMeterUser();
    }

    //查询数据总条数
    @Override
    public int stMuAge(){

        return MeterUserMapper.stMuAge();
    }
}
