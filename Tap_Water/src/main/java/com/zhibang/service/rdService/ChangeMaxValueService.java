package com.zhibang.service.rdService;

import com.zhibang.model.SyEmp;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ChangeMaxValueService
 * @Description 最大表码修正记录
 * @createTime 2020/12/12 17:59
 **/
public interface ChangeMaxValueService {

    //查询最大码修正数据
    List<Map<String,Object>> selectMaxValue();

    //查询所有操作人员
    List<SyEmp> selEmpName();
}
