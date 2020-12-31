package com.zhibang.service.beService;

import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.model.UsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    //工单管理：xxy
    public List<BeOrder> queryAllOrder(@Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName);

    //业扩收费报表查询：xxy
    public List<BeOrder> selAllOrder(@Param("orderType") String orderType, @Param("time1") String time1, @Param("time2") String time2);

    //业扩收费查询总交费:xxy
    public Double selSumMoney(@Param("orderType") String orderType, @Param("time1") String time1, @Param("time2") String time2);

    //yjh
    public List<BeOrder> selBeOrderStepId(Integer stepId, String orderType);
    //流程处理-yjh
    public Integer upBeOrderStepId(String stmt, BeOrder beOrder);
    //通过工单号查询工单详情信息-yjh
    public BeOrder selBeOrderOrderNo(String orderNo);
    //修改费用-yjh
    public Integer upOrderAndUserMoney(BeOrder beOrder, UsUser usUser);

}
