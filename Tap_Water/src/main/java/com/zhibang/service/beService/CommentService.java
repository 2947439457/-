package com.zhibang.service.beService;

import com.zhibang.model.BeComment;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CommentService.java
 * @Description TODO
 * @createTime 2020年12月24日 15:08:00
 */
public interface CommentService {

    //添加附加信息
    public Integer addComment(BeComment beComment);

    //通过工单号查询附加信息
    public List<BeComment> selCommentOrderNo(String orderNo);

}
