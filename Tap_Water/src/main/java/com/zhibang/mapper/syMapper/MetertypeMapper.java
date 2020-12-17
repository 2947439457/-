package com.zhibang.mapper.syMapper;

import com.zhibang.model.SyMetertype;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 辉
 * @version 1.0.0
 * @ClassName MetertypeMapper.java
 * @Description TODO 水表型号表
 * @createTime 2020年12月15日 09:28:00
 */
@Repository
public interface MetertypeMapper {

    //查询全部水表信息:yjh
    public List<SyMetertype> selectSyMetertype();

}
