package com.zhibang.mapper.rdMapper;

import com.zhibang.model.RdChangemaxvalue;
import com.zhibang.model.SyEmp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName ChangeMaxValueMapper
 * @Description 最大表码修正记录
 * @createTime 2020/12/12 17:02
 **/
@Repository
public interface ChangeMaxValueMapper {
    //查询最大码修正数据
    List<Map<String,Object>> selectMaxValue();

    //查询所有操作人员
    List<SyEmp> selEmpName();
}
