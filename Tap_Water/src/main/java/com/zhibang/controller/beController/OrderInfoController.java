package com.zhibang.controller.beController;

import com.zhibang.mapper.beMapper.CommentMapper;
import com.zhibang.mapper.beMapper.HistoryMapper;
import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.mapper.syMapper.EmpMapper;
import com.zhibang.model.*;
import com.zhibang.service.beService.CommentService;
import com.zhibang.service.beService.OrderService;
import com.zhibang.service.beService.OrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName OrderInfoController.java
 * @Description TODO 工单用户详细
 * @createTime 2020年12月23日 19:17:00
 */
@Controller
@RequestMapping("/be")
public class OrderInfoController {

    @Autowired private HistoryMapper historyMapper;
    @Autowired private OrderService orderService;
    @Autowired private CommentService commentService;
    @Autowired private OrderUserService orderUserService;
    @Autowired private EmpMapper empMapper;
    @Autowired private BeComment beComment;
    @Autowired private BeOrder beOrder;

    //跳转工单用户详细页面
    @GetMapping("/orderInfo")
    public String orderInfo(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeHistory> beHistories = historyMapper.selectBeHistoryOrderNo(orderNo);
        List<BeComment> beComments = commentService.selCommentOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        List<SyEmp> syEmps = empMapper.selectSyEmp();
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beHistories", beHistories);
        model.addAttribute("beComments", beComments);
        model.addAttribute("beOrderusers", beOrderusers);
        model.addAttribute("syEmps", syEmps);
        return "/page/be_orderInfo";
    }

    @ResponseBody
    @PostMapping("/putComment")
    public List<BeComment> putComment(String orderNo, String comment, HttpSession httpSession){
        BeComment addBeComment = beComment;
        BeOrder addBeOrder = beOrder;
        addBeOrder.setOrderNo(orderNo);
        addBeComment.setOrderNo(addBeOrder);
        SyEmp syEmp = (SyEmp) httpSession.getAttribute("s");
        addBeComment.setEmpId(syEmp);
        List<BeComment> beComments = commentService.selCommentOrderNo(orderNo);
        return beComments;
    }

}
