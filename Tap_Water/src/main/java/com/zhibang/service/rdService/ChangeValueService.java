package com.zhibang.service.rdService;

import com.zhibang.model.RdChangevalue;

import java.util.List;
import java.util.Map;

/**
 * @Author 何岷鸿
 * @ClassName ChangeValueService
 * @Description 底码修正记录
 * @createTime 2020/12/12 18:01
 **/
public interface ChangeValueService {

    //查询底码修正数据
    List<Map<String,Object>> selectValue();
}
