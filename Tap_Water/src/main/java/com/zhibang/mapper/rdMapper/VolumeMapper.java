package com.zhibang.mapper.rdMapper;

import com.zhibang.model.RdVolume;
import com.zhibang.model.SyArea;
import com.zhibang.model.UsMeter;
import com.zhibang.model.UsUser;
import org.omg.CORBA.StringHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author 罗恒煌
 * @ClassName VolumeMapper
 * @Description 表册
 * @createTime 2020/12/17 14:50
 **/
@Repository
public interface VolumeMapper {

    /**
     * @Author 罗恒煌
     * @Description 查询所有表册信息：默认显示未分配用户
     *@createTime 2020/12/17 14:52
     */
        public List<UsUser> queryAllVolume_Default();

    /**
     * @Author 罗恒煌
     * @Description 查询所有表册信息：依据所属辖区查询用户
     * @return 2020/12/20 14:52
     */
    public List<UsUser> queryAllVolume_Param(int volumeID);

    /**
     * @Author 罗恒煌
     * @Description 查询所有辖区
     * @return 2020/12/20 15:20
     */
    public List<SyArea> queryAllArea();

    /**
     * @Author 罗恒煌
     * @Description 查询所有辖区中的表册名
     * @return 2020/12/20 15:20
     */
    public List<RdVolume> queryAllVolumeName();

    /**
     * @Author 罗恒煌
     * @Description 添加表册
     * @Param 表册名，辖区（只需要ID），备注
     * @return 2020/12/20 15:20
     */
    public int insertVoulme(String volumeName,Integer areaId,String remark);

    /**
     * 删除表册(修改状态)
     * @param id
     * @return
     */
    public int updateVolume_stat(Integer id);

    /**
     * 修改表册
     * @param id
     * @return
     */
    public int updateVolume(String VolumeName,Integer AreaID,String Remark,Integer id);

    /**
     * 根据ID查询表册信息
     * @param id
     * @return
     */
      public RdVolume queryByIDRdVolume(Integer id);

    /**
     * 修改用户所属辖区
     * @param str
     * @return
     */
    public int updateVolume_area(Integer id,String str);
}
