package com.zhibang.service.system.impl;

import com.zhibang.mapper.system.AreaMapper;
import com.zhibang.mapper.system.MeterTypeMapper;
import com.zhibang.model.SyArea;
import com.zhibang.model.SyMetertype;
import com.zhibang.service.syService.MetertypeService;
import com.zhibang.service.system.MeterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeterTypeServiceImpl implements MeterTypeService {

    @Autowired
    MeterTypeMapper meterMapper;

    /**
     * 查询所有水表型号信息YX
     * @return
     */
    @Override
    public List<SyMetertype> selectSyMeterType(){return meterMapper.selectSyMeterType();}

    /**
     * 添加水表型号信息YX
     * @param syMeterType
     * @return
     */
    @Override
    public Integer addSyMeterType(SyMetertype syMeterType){return meterMapper.addSyMetertype(syMeterType);}

    /**
     * 修改水表型号信息YX
     * @param syMeterType
     * @return
     */
    @Override
    public Integer updateSyMeterType(SyMetertype syMeterType){return meterMapper.updateSyMetertype(syMeterType);}

    /**
     * 删除水表型号信息YX
     * @param id
     * @return
     */
    @Override
    public Integer delSyMeterType(Integer id){return meterMapper.delSyMetertype(id);}
}
