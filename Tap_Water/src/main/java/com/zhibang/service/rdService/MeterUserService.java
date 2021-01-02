package com.zhibang.service.rdService;

import com.zhibang.model.RdChangevalue;
import com.zhibang.model.SyEmp;
import com.zhibang.model.UsMeter;
import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName MeterUserService
 * @Description 水表周检报表
 * @createTime 2020/12/12 18:03
 **/
public interface MeterUserService {

    //查询周检表数据
    List<Map<String,Object>> selectMeterUser();

    //查询数据总条数
    int stMuAge();
}
