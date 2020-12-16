package com.zhibang.service;

import com.zhibang.model.SyMetertype;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InitService.java
 * @Description TODO 初始化数据
 * @createTime 2020年12月15日 08:32:00
 */
public interface InitService {

    //获得全部水表型号
    public List<SyMetertype> selSyMetertype();

}
