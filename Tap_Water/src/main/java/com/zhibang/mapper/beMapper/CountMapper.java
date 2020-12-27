package com.zhibang.mapper.beMapper;

import com.zhibang.model.BeFlow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountMapper {

    //获得流程表中所有的数据
    public List<BeFlow> selectIdBeFlow();

    //
    public String countOrderNo(@Param("stepId") Integer stepId, @Param("orderType") Integer orderType);

}
