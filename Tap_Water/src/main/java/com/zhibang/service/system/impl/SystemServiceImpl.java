package com.zhibang.service.system.impl;

import com.zhibang.mapper.system.SystemMapper;
import com.zhibang.model.SyArea;
import com.zhibang.model.SyDept;
import com.zhibang.model.SyEmp;
import com.zhibang.model.SyMetertype;
import com.zhibang.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    private SystemMapper systemMapper;



    /**
     * 登录验证YX
     * @param syEmp
     * @return
     */
    @Override
    public SyEmp selectEepById(SyEmp syEmp){
        return systemMapper.selectEepById(syEmp);
    }

    /**
     * 查询所有辖区YX
     * @return
     */
    @Override
    public List<SyArea> selectSyarea(){return systemMapper.selectSyarea();}

    /**
     * 查询所有水表型号YX
     * @return
     */
    @Override
    public List<SyMetertype> selectSyMetertype(){return systemMapper.selectSyMetertype();}

    /**
     * 查询所有部门YX
     * @return
     */
    @Override
    public List<SyDept> selectSyDept(){return systemMapper.selectSyDept();}

    /**
     * 查询所有员工YX
     * @return
     */
    @Override
    public List<SyEmp> selectSyEmp(){return systemMapper.selectSyEmp();}

}
