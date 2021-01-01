package com.zhibang.mapper.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyMetertype;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MeterTypeMapper {
    /**
     * 查询所有水表型号YX
     * @return
     */
    @Select("SELECT * FROM sy_metertype WHERE Disabled=true")
    public List<SyMetertype> selectSyMeterType();

    /**
     * 增加水表型号YX
     * @param syMetertype
     * @return
     */
    @Insert("INSERT INTO `sy_metertype` VALUES(" +
            "DEFAULT,${meterTypeName},${aperture},${mavValue},${minValue},${life},${remark},true)")
    public Integer addSyMetertype(SyMetertype syMetertype);
    /**
     * 查询单个水表型号YX
     * @return
     */
    @Select("SELECT * FROM sy_metertype WHERE `ID`=${id} AND Disabled=1")
    public SyMetertype selectSyMetertypeID(Integer id);
    /**
     * 修改水表型号YX
     * @param syMetertype
     * @return
     */
    @Update("UPDATE `sy_metertype` SET `MeterTypeName`=${meterTypeName},`Aperture`=${aperture}," +
            "`MavValue`=${mavValue},`MinValue`=${minValue},`Life`=${life},`Remark`=${remark} WHERE `ID`=${id}")
    public Integer updateSyMetertype(SyMetertype syMetertype);

    /**
     * 删除辖区信息YX
     * @param id
     * @return
     */
    @Delete("DELETE FROM `sy_metertype` WHERE `ID`=${id};")
    public Integer delSyMetertype(Integer id);
}
