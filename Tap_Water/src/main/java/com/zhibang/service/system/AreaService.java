package com.zhibang.service.system;

import com.zhibang.model.SyArea;

import java.util.List;

public interface AreaService {
    /**
     * 查询所有辖区YX
     * @return
     */
    public List<SyArea> selectSyArea();

    /**
     * 添加辖区方法YX
     * @param syArea
     * @return
     */
    public Integer addSyArea(SyArea syArea);
    /**
     * 查询单个辖区YX
     * @return
     */
    public SyArea selectSyAreaID(Integer id);
    /**
     * 修改辖区方法YX
     * @param syArea
     * @return
     */
    public Integer updateSyArea(SyArea syArea);

    /**
     * 删除辖区方法YX
     * @param id
     * @return
     */
    public Integer delSyArea(Integer id);



}
