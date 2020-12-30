package com.zhibang.service.beService.impl;

import com.zhibang.mapper.beMapper.OrderUserMapper;
import com.zhibang.model.BeOrderuser;
import com.zhibang.service.beService.OrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderUserServiceImpl.java
 * @Description TODO
 * @createTime 2020年12月21日 14:05:00
 */
@Service
public class OrderUserServiceImpl implements OrderUserService {

    @Autowired private OrderUserMapper orderUserMapper;

    @Override
    public Integer addOrderUser(List<BeOrderuser> listOu) {
        return orderUserMapper.addOrderUser(listOu);
    }

    @Override
    public List<BeOrderuser> selOrderuserOrderNo(String orderNo) {
        return orderUserMapper.selectBeOrderuserOrderNo(orderNo);
    }

    @Override
    public Integer upOrderuserMoney(BeOrderuser beOrderuser) {
        return orderUserMapper.upBeOrderuser(beOrderuser);
    }
}
