package com.zhibang.mapper.usMapper;

import com.zhibang.model.UsMeter;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MeterMapper.java
 * @Description TODO
 * @createTime 2021年01月01日 23:51:00
 */
@Repository
public interface MeterMapper {

    //查询水表编号
    public String selectMeterNo(String userNo);
    //添加用户水表
    public Integer addUsMeter(UsMeter usMeter);
    //修改用户水表
    public Integer upUsMeter(UsMeter usMeter);
    //通过用户编码查询用户水表信息
    public UsMeter selectUsMeterUserNo(String userNo);

}
