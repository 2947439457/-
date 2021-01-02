package com.zhibang.controller.beController;

import com.alibaba.fastjson.JSONObject;
import com.zhibang.model.*;
import com.zhibang.service.beService.OrderService;
import com.zhibang.service.beService.OrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SaveContorller.java
 * @Description TODO 档案存档
 * @createTime 2020年12月29日 23:33:00
 */
@Controller
@RequestMapping("/be")
public class SaveContorller {

    @Autowired private OrderService orderService;
    @Autowired private OrderUserService orderUserService;
    @Autowired private BeOrder beOrder;
    @Autowired private BeOrderuser beOrderuser;
    @Autowired private UsUser usUser;
    @Autowired private BeFlow beFlow;

    //跳转供水协议页面:yjh
    @GetMapping("/save")
    public String save(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(8, "1,2,3,4,5,6,7");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__save";
    }

    //跳转供水协议处理页面:yjh
    public String saveForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        return "/page/be__saveForm";
    }

    //处理
    @ResponseBody
    @RequestMapping(value = "/disposeSave")
    public Integer disposeSave(String stmt, String orderNo, Integer orderType, String userNo, String docNums, HttpSession httpSession){
        Integer integer = 0;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            SyEmp upSyEmp = (SyEmp) httpSession.getAttribute("s");
            upBeOrder.setLastEditEmp(upSyEmp);

            UsUser upUsUser = usUser;
            upUsUser.setUserNo(userNo);

            List<BeOrderuser> list = JSONObject.parseArray(docNums, BeOrderuser.class);
            int panDuan=0;
            for (BeOrderuser beOrderuser : list) {
                if (panDuan == 0){
                    upUsUser.setDocNum(beOrderuser.getDocNum());
                }
                panDuan++;
                beOrderuser.setOrderNo(upBeOrder);
                Integer i = orderUserService.upOrderuserMeter(beOrderuser);
            }

            BeFlow upstepId = beFlow;
            upstepId.setId(8);
            upBeOrder.setStepId(upstepId);
            orderService.upOrderAndUserMeter(upBeOrder, upUsUser);
            integer = 1;
            if ("send".equals(stmt) || "recall".equals(stmt)){
                orderService.upBeOrderStepId(stmt, upBeOrder);
                integer = 2;
            }
        }catch (Exception e){
            integer = 3;
            e.printStackTrace();
        }
        return integer;
    }

}
