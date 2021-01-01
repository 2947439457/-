package com.zhibang.service.system.impl;

import com.zhibang.mapper.system.AreaMapper;
import com.zhibang.model.SyArea;
import com.zhibang.service.system.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    /**
     * 查询所有辖区信息YX
     * @return
     */
    @Override
    public List<SyArea> selectSyArea(){return areaMapper.selectSyArea();}

    /**
     * 添加辖区信息YX
     * @param syArea
     * @return
     */
    @Override
    public Integer addSyArea(SyArea syArea){return areaMapper.addSyArea(syArea);}
    /**
     * 查询单个辖区YX
     * @return
     */
    @Override
    public SyArea selectSyAreaID(Integer id){return areaMapper.selectSyAreaID(id);}
    /**
     * 修改辖区信息YX
     * @param syArea
     * @return
     */
    @Override
    public Integer updateSyArea(SyArea syArea){return areaMapper.updateSyArea(syArea);}

    /**
     * 删除辖区信息YX
     * @param id
     * @return
     */
    @Override
    public Integer delSyArea(Integer id){return areaMapper.delSyArea(id);}
}
