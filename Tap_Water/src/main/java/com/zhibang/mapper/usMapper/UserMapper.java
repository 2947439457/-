package com.zhibang.mapper.usMapper;

import com.zhibang.model.UsUser;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020年12月15日 19:58:00
 */
@Repository
public interface UserMapper {

    //添加用户
    public Integer addUser(UsUser usUser);

    //查询用户编码
    public String selectUserNo(Integer orderType);

}
