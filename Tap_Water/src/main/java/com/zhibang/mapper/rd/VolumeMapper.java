package com.zhibang.mapper.rd;

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
    public List<UsUser> queryAllVolume_Param(String volumeID);

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
}
