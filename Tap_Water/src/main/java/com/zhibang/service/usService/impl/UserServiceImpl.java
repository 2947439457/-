package com.zhibang.service.usService.impl;

import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.mapper.usMapper.UserMapper;
import com.zhibang.model.BeOrder;
import com.zhibang.model.UsUser;
import com.zhibang.service.usService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public Integer addUserAndOrder(UsUser usUser, BeOrder beOrder) {
        Integer integer = userMapper.addUser(usUser);
        orderMapper.addOrder(beOrder);
        return integer;
    }
}
