package com.zhibang.service.sy;

import com.zhibang.model.SyMetertype;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MetertypeServiceImpl.java
 * @Description TODO
 * @createTime 2020年12月15日 09:16:00
 */
public interface MetertypeService {

    //获得全部水表型号
    public List<SyMetertype> selSyMetertype();

}
