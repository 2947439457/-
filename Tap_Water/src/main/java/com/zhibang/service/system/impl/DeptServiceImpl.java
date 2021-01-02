package com.zhibang.service.system.impl;

import com.zhibang.mapper.system.DeptMapper;
import com.zhibang.model.SyDept;
import com.zhibang.service.system.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired DeptMapper DeptMapper;

    /**
     * 查询所有部门YX
     * @return
     */
    @Override
    public List<SyDept> selectSyDept(){return DeptMapper.selectSyDept();}

    /**
     * 查询单个部门YX
     * @param id
     * @return
     */
    @Override
    public SyDept selectSyDeptID(Integer id){return DeptMapper.selectSyDeptID(id);}

    /**
     * 增加部门信息YX
     * @param syDept
     * @return
     */
    @Override
    public Integer addDapt(SyDept syDept){return DeptMapper.addDapt(syDept);}
    /**
     * 修改部门信息YX
     * @param syDapt
     * @return
     */
    @Override
    public Integer updateDapt(SyDept syDapt){return DeptMapper.updateDapt(syDapt);}
}
