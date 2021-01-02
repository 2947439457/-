package com.zhibang.service.system;

import com.zhibang.model.SyDept;
import com.zhibang.model.SyMetertype;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门YX
     * @return
     */
    public List<SyDept> selectSyDept();


    /**
     * 增加部门信息YX
     * @param syDept
     * @return
     */
    public Integer addDapt(SyDept syDept);
    /**
     * 查询单个部门YX
     * @return
     */
    public SyDept selectSyDeptID(Integer id);

    /**
     * 修改部门信息方法YX
     * @param syDapt
     * @return
     */
    public Integer updateDapt(SyDept syDapt);

//    /**
//     * 删除水表型号方法YX
//     * @param id
//     * @return
//     */
//    public Integer delSyMeterType(Integer id);
}
