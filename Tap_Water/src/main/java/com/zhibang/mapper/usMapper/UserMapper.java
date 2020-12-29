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

    //添加用户:yjh
    public Integer addUser(UsUser usUser);
    //查询用户编码:yjh
    public String selectUserNo(Integer orderType);
    //通过用户编码查询用户信息：xxy
    public UsUser selectUsUser(String userNo);
    //修改用户信息-yjh：可扩展
    public Integer updateUsUserUserNo(UsUser usUser);
}
