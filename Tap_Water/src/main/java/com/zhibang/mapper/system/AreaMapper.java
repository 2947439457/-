package com.zhibang.mapper.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyMetertype;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AreaMapper {
    /**
     * 查询所有辖区YX
     * @return
     */
    @Select("SELECT * FROM sy_area WHERE Disabled=1")
    public List<SyArea> selectSyArea();

    /**
     * 增加辖区信息YX
     * @param syArea
     * @return
     */
    @Insert("INSERT INTO `sy_area` VALUES(DEFAULT,'${areaName}','${remark}',1)")
    public Integer addSyArea(SyArea syArea);
    /**
     * 查询单个辖区YX
     * @return
     */
    @Select("SELECT * FROM sy_area WHERE `ID`=${id} AND Disabled=1")
    public SyArea selectSyAreaID(Integer id);
    /**
     * 修改辖区信息YX
     * @param syArea
     * @return
     */
    @Update("UPDATE `sy_area` SET `AreaName`='${areaName}',`Remark`='${remark}' WHERE `ID`=${id}")
    public Integer updateSyArea(SyArea syArea);

    /**
     * 删除辖区信息YX
     * @param id
     * @return
     */
    @Delete("DELETE FROM `sy_area` WHERE `ID`=${id};")
    public Integer delSyArea(Integer id);

}
