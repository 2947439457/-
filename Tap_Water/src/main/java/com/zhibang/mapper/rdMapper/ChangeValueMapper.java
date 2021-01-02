package com.zhibang.mapper.rdMapper;

import com.zhibang.model.RdChangemaxvalue;
import com.zhibang.model.RdChangevalue;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName ChangeValueMapper
 * @Description 底码修正记录
 * @createTime 2020/12/12 17:03
 **/
@Repository
public interface ChangeValueMapper {
    //查询底码修正数据
    List<Map<String,Object>> selectValue();
}
