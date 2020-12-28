package com.zhibang.mapper.beMapper;

import com.zhibang.model.BeHistory;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName HistoryMapper.java
 * @Description TODO 业扩流程
 * @createTime 2020年12月23日 19:30:00
 */
public interface HistoryMapper {

    //添加记录流程表
    public Integer addBeHistory(BeHistory beHistory);

    //按照工单号查询流程信息：yjh
    public List<BeHistory> selectBeHistoryOrderNo(String orderNo);

}
