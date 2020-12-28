package com.zhibang.service.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyMetertype;

import java.util.List;

public interface MeterTypeService {
    /**
     * 查询所有水表型号YX
     * @return
     */
    public List<SyMetertype> selectSyMeterType();

    /**
     * 添加水表型号方法YX
     * @param syMetertype
     * @return
     */
    public Integer addSyMeterType(SyMetertype syMetertype);

    /**
     * 修改水表型号方法YX
     * @param syMetertype
     * @return
     */
    public Integer updateSyMeterType(SyMetertype syMetertype);

    /**
     * 删除水表型号方法YX
     * @param id
     * @return
     */
    public Integer delSyMeterType(Integer id);
}
