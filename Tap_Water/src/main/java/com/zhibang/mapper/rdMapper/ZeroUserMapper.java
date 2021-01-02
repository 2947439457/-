package com.zhibang.mapper.rdMapper;

import com.zhibang.model.RdChangevalue;
import com.zhibang.model.RdRead;
import org.springframework.stereotype.Repository;

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
}
