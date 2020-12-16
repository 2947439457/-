package com.zhibang.mapper.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyEmp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemMapper {
    //登录验证
    @Select("SELECT * FROM sy_emp WHERE EmpNo=#{empNo} AND Pwd=#{pwd} AND Disabled=true")
    public SyEmp selectEepById(SyEmp syEmp);
    @Select("SELECT * FROM sy_area")
    public List<SyArea> selectSy_area();
}
