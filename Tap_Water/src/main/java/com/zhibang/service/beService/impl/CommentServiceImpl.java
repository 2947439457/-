package com.zhibang.service.beService.impl;

import com.zhibang.mapper.beMapper.CommentMapper;
import com.zhibang.model.BeComment;
import com.zhibang.service.beService.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CommentServiceImpl.java
 * @Description TODO
 * @createTime 2020年12月24日 15:08:00
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired private CommentMapper commentMapper;

    @Override
    public Integer addComment(BeComment beComment) {
        return commentMapper.addBeComment(beComment);
    }

    @Override
    public List<BeComment> selCommentOrderNo(String orderNo) {
        return commentMapper.selectBeCommentOrderNo(orderNo);
    }
}
