package com.zhibang.service.beService;

import com.zhibang.model.BeOrder;

public interface AbortService {

    //根据工单号查询相关信息:xxy
    public BeOrder queryByOrder(String orderNo);

}
