package com.zhibang.service.beService;

import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.model.UsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    //工单管理：xxy
    public List<BeOrder> queryAllOrder(@Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName);
    //查询工单进度：xxy
    public List<BeFlow> queryStepNameType();
    //yjh
    public List<BeOrder> selBeOrderStepId(Integer stepId, String orderType);
    //流程处理-yjh
    public Integer upBeOrderStepId(String stmt, BeOrder beOrder);
    //通过工单号查询工单详情信息-yjh
    public BeOrder selBeOrderOrderNo(String orderNo);
    //修改费用-yjh
    public Integer upOrderAndUserMoney(BeOrder beOrder, UsUser usUser);

}
