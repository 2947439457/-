package com.zhibang.service.rdService.impl;

import com.zhibang.mapper.rdMapper.ZeroUserMapper;
import com.zhibang.model.RdRead;
import com.zhibang.service.rdService.ZeroUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ZeroUserServiceImpl
 * @Description 零吨位用户情况报表
 * @createTime 2020/12/12 18:06
 **/
@Service
public class ZeroUserServiceImpl implements ZeroUserService {

    @Autowired
    public ZeroUserMapper ZeroUserMapper;//零吨位用户

    //查询零吨位用户数据
    @Override
    public List<Map<String,Object>> selectZeroUser(){

        return ZeroUserMapper.selectZeroUser();
    }

    //根据条件进行查询
    @Override
    public List<Map<String,Object>> selectZeroUsers(String qTime, String hTime, String areaName,String audit){
        return ZeroUserMapper.selectZeroUsers(qTime, hTime, areaName, audit);
    }
}
