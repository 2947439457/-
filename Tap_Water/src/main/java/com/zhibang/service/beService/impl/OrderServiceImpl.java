package com.zhibang.service.beService.impl;

import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 工单管理：xxy
     * @return
     */
    @Override
    public List<BeOrder> queryAllOrder() {
        return orderMapper.queryAllOrder();
    }

    /**
     * 查询工单进度：xxy
      * @return
     */
    @Override
    public List<BeFlow> queryStepNameType() {
        return orderMapper.queryStepNameType();
    }

    /**
     * 根据 工单类型 or 工程进度 or 工单号 or 用户姓名查询:xxy
     */
    @Override
    public List<BeOrder> queryTypeOrNameOrUserNo(int OrderType, String StepName, String OrderNo, String UserName) {
        return orderMapper.queryTypeOrNameOrUserNo(OrderType, StepName, OrderNo, UserName);
    }

}
