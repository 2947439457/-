package com.zhibang.service.beService.impl;

import com.zhibang.mapper.beMapper.AbortMapper;
import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.AbortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class AbortServiceImpl implements AbortService {

    @Autowired
    private AbortMapper abortMapper;

    //根据工单号查询相关信息:xxy
    @Override
    public BeOrder queryByOrder(String orderNo) {
        return abortMapper.queryByOrder(orderNo);
    }

    @Override
    public int upByOrder(BeOrder beOrder) {
        return abortMapper.upByOrder(beOrder);
    }


}
