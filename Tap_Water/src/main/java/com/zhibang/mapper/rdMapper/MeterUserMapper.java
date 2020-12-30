package com.zhibang.mapper.rdMapper;

import com.zhibang.model.RdChangevalue;
import com.zhibang.model.SyEmp;
import com.zhibang.model.UsMeter;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName MeterUserMapper
 * @Description 水表周检报表
 * @createTime 2020/12/12 17:04
 **/
@Repository
public interface MeterUserMapper {

    //查询周检表数据
    List<Map<String,Object>> selectMeterUser();

    //查询数据总条数
    int stMuAge();
}
