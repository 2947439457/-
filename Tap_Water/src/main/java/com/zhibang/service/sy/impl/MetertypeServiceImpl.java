package com.zhibang.service.sy.impl;

import com.zhibang.mapper.sy.MetertypeMapper;
import com.zhibang.model.SyMetertype;
import com.zhibang.service.sy.MetertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MetertypeServiceImpl.java
 * @Description TODO
 * @createTime 2020年12月15日 09:17:00
 */
@Service
public class MetertypeServiceImpl implements MetertypeService {

    @Autowired
    public MetertypeMapper metertypeMapper; //水表型号表

    @Override
    public List<SyMetertype> selSyMetertype() {
//        获得全部水表型号
        return metertypeMapper.selectSyMetertype();
    }

}
