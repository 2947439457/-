package com.zhibang.service.beService.impl;

import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.OrderService;
import org.apache.ibatis.annotations.Param;
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
    public List<BeOrder> queryAllOrder(@Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName) {
        return orderMapper.queryAllOrder(orderType,stepName,orderNo,userName);
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
//    @Override
//    public List<BeOrder> queryTypeOrNameOrUserNo(@Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName) {
//        return orderMapper.queryTypeOrNameOrUserNo(orderType, stepName, orderNo, userName);
//    }

    //yjh
    @Override
    public List<BeOrder> selBeOrderStepId(Integer stepId, String orderTypr) {
        return orderMapper.selectBeOrderStepId(stepId, orderTypr);
    }

    //yjh
    @Override
    public Integer upBeOrderStepId(String stmt, BeOrder beOrder) {
        if ("send".equals(stmt)){ //发送
            return orderMapper.senddateBeOrderStepId(beOrder);
        }else{ //撤回
            return orderMapper.recalldateBeOrderStepId(beOrder);
        }
    }

    //yjh
    @Override
    public BeOrder selBeOrderOrderNo(String orderNo) {
        return orderMapper.selectBeOrderOrderNo(orderNo);
    }

}
