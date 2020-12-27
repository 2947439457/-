package com.zhibang.mapper.beMapper;

import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Order.java
 * @Description TODO
 * @createTime 2020年12月15日 19:58:00
 */
@Repository
public interface OrderMapper {

    //添加业扩工单:yjh
    public Integer addOrder(BeOrder beOrder);

    //查询业扩工单:yjh
    public String selectOrderNo(String orderType);

    //工单管理：xxy
    public List<BeOrder> queryAllOrder(@Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName);

    //查询工单进度：xxy
    public List<BeFlow> queryStepNameType();

//    //根据 工单类型 or 工程进度 or 工单号 or 用户姓名查询:xxy
//    public List<BeOrder> queryTypeOrNameOrUserNo(@Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName);

    //按流程查询工单：yjh
    public List<BeOrder> selectBeOrderStepId(@Param("stepId")Integer stepId, @Param("orderType")String orderType);

    //发送流程：yjh
    public Integer senddateBeOrderStepId(BeOrder beOrder);

    //撤回流程：yjh
    public Integer recalldateBeOrderStepId(BeOrder beOrder);

    //通过业扩工单查询工单信息：yjh
    public BeOrder selectBeOrderOrderNo(String orderNo);

}
