package com.zhibang.service.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyMetertype;

import java.util.List;

public interface MeterTypeService {
    /**
     * 查询所有辖区YX
     * @return
     */
    public List<SyMetertype> selectSyMeterType();

    /**
     * 添加辖区方法YX
     * @param syMetertype
     * @return
     */
    public Integer addSyMeterType(SyMetertype syMetertype);

    /**
     * 修改辖区方法YX
     * @param syMetertype
     * @return
     */
    public Integer updateSyMeterType(SyMetertype syMetertype);

    /**
     * 删除辖区方法YX
     * @param id
     * @return
     */
    public Integer delSyMeterType(Integer id);
}
