package com.zhibang.service.system.impl;

import com.zhibang.mapper.system.SystemMapper;
import com.zhibang.model.*;
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
    @Override
    public SyEmp selectSyEmps(SyEmp syEmp){
        return systemMapper.selectSyEmps(syEmp);
    }
    @Override
    public Integer updateSyEmp(SyEmp syEmp){
        return systemMapper.updateSyEmp(syEmp);
    }
    /**
     * 查询所有辖区YX
     * @return
     */
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

    /**
     * 查询用水类型YX
     * @param id
     * @return
     */
    @Override
    public List<SyCosttype> selectSyCosttype(Integer id){return systemMapper.selectSyCosttype(id);}

    @Override
    public List<BeFlow> selectBeFlow(){return systemMapper.selectBeFlow();}

}
