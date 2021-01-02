package com.zhibang.mapper.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyDept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DeptMapper {
    /**
     * 查询所有部门YX
     * @return
     */
    @Select("SELECT * FROM sy_dept WHERE Disabled=true")
    public List<SyDept> selectSyDept();

    /**
     * 增加部门信息YX
     * @param syDept
     * @return
     */
    @Insert("INSERT INTO `sy_dept` VALUES(DEFAULT,'${deptName}','${remark}',1)")
    public Integer addDapt(SyDept syDept);
    /**
     * 查询单个部门YX
     * @return
     */
    @Select("SELECT * FROM sy_dept WHERE `ID`=${id} AND Disabled=1")
    public SyDept selectSyDeptID(Integer id);
    /**
     * 修改部门信息YX
     * @param syDapt
     * @return
     */
    @Update("UPDATE `sy_dept` SET `deptName`='${deptName}',`Remark`='${remark}' WHERE `ID`=${id}")
    public Integer updateDapt(SyDept syDapt);

    /**
     * 删除辖区信息YX
     * @param id
     * @return
     */
    @Delete("DELETE FROM `sy_dept` WHERE `ID`=${id};")
    public Integer delSyArea(Integer id);
}
