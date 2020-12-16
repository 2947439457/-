package com.zhibang.service.impl;

import com.zhibang.mapper.sy.MetertypeMapper;
import com.zhibang.model.SyMetertype;
import com.zhibang.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InitServiceImpl.java
 * @Description TODO 初始化数据
 * @createTime 2020年12月15日 08:33:00
 */
@Service
public class InitServiceImpl implements InitService {

    @Autowired
    public MetertypeMapper metertypeMapper; //水表型号表

    @Override
    public List<SyMetertype> selSyMetertype() {
        //获得全部水表型号
        return metertypeMapper.selectSyMetertype();
    }
}
