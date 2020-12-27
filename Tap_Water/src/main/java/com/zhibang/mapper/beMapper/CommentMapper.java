package com.zhibang.mapper.beMapper;

import com.zhibang.model.BeComment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CommentMapper.java
 * @Description TODO
 * @createTime 2020年12月24日 14:39:00
 */
@Repository
public interface CommentMapper {

    //添加附加信息记录
    public Integer addBeComment(BeComment beComment);

    //按照工单号查询附加信息记录
    public List<BeComment> selectBeCommentOrderNo(String orderNo);

}
