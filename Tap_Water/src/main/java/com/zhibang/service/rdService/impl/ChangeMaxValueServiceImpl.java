package com.zhibang.service.rdService.impl;


import com.zhibang.mapper.rdMapper.ChangeMaxValueMapper;
import com.zhibang.model.SyEmp;
import com.zhibang.service.rdService.ChangeMaxValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ChangeMaxValueServiceImpl
 * @Description 最大表码修正记录
 * @createTime 2020/12/12 17:59
 **/
@Service
public class ChangeMaxValueServiceImpl implements ChangeMaxValueService {

    @Autowired
    public ChangeMaxValueMapper ChangeMaxValueMapper;//最大码值

    //查询最大码修正数据
    @Override
    public List<Map<String,Object>> selectMaxValue() {

        return ChangeMaxValueMapper.selectMaxValue();
    }

    //查询所有操作人员
    @Override
    public List<SyEmp> selEmpName(){
        return ChangeMaxValueMapper.selEmpName();
    }
}
