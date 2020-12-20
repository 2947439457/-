package com.zhibang.service.usService;

import com.zhibang.model.BeOrder;
import com.zhibang.model.BeOrderuser;
import com.zhibang.model.UsUser;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2020年12月15日 23:12:00
 */
public interface UserService {

//    添加用户以及工单:yjh
    public Integer addUserAndOrder(UsUser usUser, BeOrder beOrder, List<BeOrderuser> beOrderusers);

//    通过用户编码查询用户信息：xxy
    public UsUser selUsUser(String userNo);

}
