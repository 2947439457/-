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

    //添加数据到工单用户详情表：yjh
    public Integer addOrderUser(List<BeOrderuser> listOu);

}
