package com.zhibang.mapper.syMapper;

import com.zhibang.model.SyEmp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName EmpMapper.java
 * @Description TODO
 * @createTime 2020年12月27日 11:00:00
 */
@Repository
public interface EmpMapper {

//    查询全部员工信息-yjh
    public List<SyEmp> selectSyEmp();

}
