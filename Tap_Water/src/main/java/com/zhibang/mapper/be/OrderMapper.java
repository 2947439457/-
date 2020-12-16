package com.zhibang.mapper.be;

import com.zhibang.model.BeOrder;
import org.springframework.stereotype.Controller;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Order.java
 * @Description TODO
 * @createTime 2020年12月15日 19:58:00
 */
@Controller
public interface OrderMapper {

    //添加业扩工单
    public Integer addOrder(BeOrder beOrder);

}
