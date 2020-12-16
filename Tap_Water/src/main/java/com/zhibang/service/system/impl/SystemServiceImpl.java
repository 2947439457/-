package com.zhibang.service.system.impl;

import com.zhibang.mapper.system.SystemMapper;
import com.zhibang.model.SyArea;
import com.zhibang.model.SyEmp;
import com.zhibang.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    private SystemMapper systemMapper;
    @Override
    public SyEmp selectEepById(SyEmp syEmp){
        return systemMapper.selectEepById(syEmp);
    }
    @Override
    public List<SyArea> selectSy_area(){return systemMapper.selectSy_area();}

}
