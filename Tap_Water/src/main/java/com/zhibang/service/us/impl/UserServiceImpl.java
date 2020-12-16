package com.zhibang.service.us.impl;

import com.zhibang.mapper.be.OrderMapper;
import com.zhibang.mapper.us.UserMapper;
import com.zhibang.model.BeOrder;
import com.zhibang.model.UsUser;
import com.zhibang.service.us.UserService;
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
        userMapper.addUser(usUser);
        orderMapper.addOrder(beOrder);
        return null;
    }
}
