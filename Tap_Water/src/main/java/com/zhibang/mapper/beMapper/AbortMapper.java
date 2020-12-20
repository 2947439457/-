package com.zhibang.mapper.beMapper;

import com.zhibang.model.BeOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface AbortMapper {

    //根据工单号查询相关信息:xxy
    public BeOrder queryByOrder(String orderNo);

}
