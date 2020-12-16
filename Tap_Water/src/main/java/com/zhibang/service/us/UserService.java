package com.zhibang.service.us;

import com.zhibang.model.BeOrder;
import com.zhibang.model.UsUser;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2020年12月15日 23:12:00
 */
public interface UserService {

//    添加用户以及工单
    public Integer addUserAndOrder(UsUser usUser, BeOrder beOrder);

}
