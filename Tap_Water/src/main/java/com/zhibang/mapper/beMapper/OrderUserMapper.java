package com.zhibang.mapper.beMapper;

import com.zhibang.model.BeOrderuser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderUserMapper.java
 * @Description TODO
 * @createTime 2020年12月18日 14:03:00
 */
@Repository
public interface OrderUserMapper {

    //添加数据到工单用户详情表-yjh
    public Integer addOrderUser(List<BeOrderuser> listOu);
    //通关工单号查询工单信息详情
    public List<BeOrderuser> selectBeOrderuserOrderNo(String orderNo);
    //通过工单号删除对应的工单信息
    public Integer deleteBeOrderuserOrderNo(String orderNo);
    //修改工单用户详情信息的金额
    public Integer upBeOrderuserMoney(BeOrderuser beOrderuser);

}
