package com.zhibang.service.usService.impl;

import com.zhibang.mapper.beMapper.HistoryMapper;
import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.mapper.beMapper.OrderUserMapper;
import com.zhibang.mapper.usMapper.UserMapper;
import com.zhibang.model.BeHistory;
import com.zhibang.model.BeOrder;
import com.zhibang.model.BeOrderuser;
import com.zhibang.model.UsUser;
import com.zhibang.service.usService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description TODO
 * @createTime 2020年12月15日 23:12:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired public OrderMapper orderMapper;
    @Autowired public UserMapper userMapper;
    @Autowired public OrderUserMapper orderUserMapper;
    @Autowired public HistoryMapper historyMapper;
    @Autowired public BeHistory beHistory;

//    yjh
    @Override
    public Integer addUserAndOrder(UsUser usUser, BeOrder beOrder, List<BeOrderuser> beOrderusers) {
        BeHistory addbeHistory = beHistory;
        addbeHistory.setOrderNo(beOrder);
        addbeHistory.setStepId(beOrder.getStepId());
        addbeHistory.setEmpId(beOrder.getLastEditEmp());
        addbeHistory.setBack(true);
        historyMapper.addBeHistory(addbeHistory);
        Integer integer = userMapper.addUser(usUser);
        orderMapper.addOrder(beOrder);
        orderUserMapper.addOrderUser(beOrderusers);
        orderMapper.senddateBeOrderStepId(beOrder);
        return integer;
    }

    @Override
    public Integer updateUserAndOrder(UsUser usUser, BeOrder beOrder, List<BeOrderuser> beOrderusers) {
        BeHistory addbeHistory = beHistory;
        addbeHistory.setOrderNo(beOrder);
        addbeHistory.setStepId(beOrder.getStepId());
        addbeHistory.setEmpId(beOrder.getLastEditEmp());
        addbeHistory.setBack(true);
        historyMapper.addBeHistory(addbeHistory);
        orderMapper.updateBeOrderOrderNo(beOrder);
        Integer integer = userMapper.updateUsUserUserNo(usUser);
        orderUserMapper.deleteBeOrderuserOrderNo(beOrder.getOrderNo());
        orderUserMapper.addOrderUser(beOrderusers);
        orderMapper.senddateBeOrderStepId(beOrder);
        return integer;
    }

    @Override
    public UsUser selUsUser(String userNo) {
        return userMapper.selectUsUser(userNo);
    }
}
