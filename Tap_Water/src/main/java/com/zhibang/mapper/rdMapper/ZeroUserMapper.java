package com.zhibang.mapper.rdMapper;

import com.zhibang.model.RdChangevalue;
import com.zhibang.model.RdRead;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName ZeroUserMapper
 * @Description 零吨位用户情况报表
 * @createTime 2020/12/12 17:01
 **/
@Repository
public interface ZeroUserMapper {
    //查询零吨位用户数据
    List<Map<String,Object>> selectZeroUser();

    //根据条件进行查询
    List<Map<String,Object>> selectZeroUsers(@Param("qTime") String qTime, @Param("hTime") String hTime, @Param("areaName") String areaName, @Param("audit") String audit);
}
