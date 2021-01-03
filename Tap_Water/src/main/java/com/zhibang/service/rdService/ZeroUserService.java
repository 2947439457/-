package com.zhibang.service.rdService;

import com.zhibang.model.RdChangevalue;
import com.zhibang.model.RdRead;
import com.zhibang.model.SyEmp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ZeroUserService
 * @Description 零吨位用户情况报表
 * @createTime 2020/12/12 18:06
 **/
public interface ZeroUserService {

    //查询零吨位用户数据
    List<Map<String,Object>> selectZeroUser();

    //根据条件进行查询
    List<Map<String,Object>> selectZeroUsers(@Param("qTime") String qTime, @Param("hTime") String hTime,@Param("areaName") String areaName,@Param("audit") String audit);
}
