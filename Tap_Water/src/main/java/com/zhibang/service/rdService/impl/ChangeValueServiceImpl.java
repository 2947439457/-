package com.zhibang.service.rdService.impl;

import com.zhibang.service.rdService.ChangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ChangeValueServiceImpl
 * @Description 底码修正记录
 * @createTime 2020/12/12 18:01
 **/
@Service
public class ChangeValueServiceImpl implements ChangeValueService {

    @Autowired
    public com.zhibang.mapper.rdMapper.ChangeValueMapper ChangeValueMapper;//底码值

    //查询底码修正数据
    @Override
    public List<Map<String,Object>> selectValue(){

        return ChangeValueMapper.selectValue();
    }
}
