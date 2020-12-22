package com.zhibang.controller.beController;

import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/be")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 跳转到工单管理:xxy
     */
    @RequestMapping("/order")
    public String beOrder(Model model,Integer orderType, String stepName, String orderNo, String userName){
        //工单管理：xxy
        List<BeOrder> user = orderService.queryAllOrder();
        model.addAttribute("user",user);
        //查询工单进度：xxy
        List<BeFlow> bf = orderService.queryStepNameType();
        model.addAttribute("bf",bf);
        //根据 工单类型 or 工程进度 or 工单号 or 用户姓名查询:xxy
        return "/page/be_order";
    }

    //根据 工单类型 or 工程进度 or 工单号 or 用户姓名查询:xxy
    @RequestMapping("/queryMany")
    public String queryMany(Model model, @Param("orderType") String orderType, @Param("stepName") String stepName, @Param("orderNo") String orderNo, @Param("userName") String userName) {
        System.out.println(orderType+","+stepName+","+orderNo+","+userName);
        List<BeOrder> user = orderService.queryTypeOrNameOrUserNo(orderType, stepName, orderNo, userName);
        model.addAttribute("user",user);
        List<BeFlow> bf = orderService.queryStepNameType();
        model.addAttribute("bf",bf);
        for (BeOrder users : user) {
            System.out.println(users);
        }
        return "/page/be_order";
    }
        //跳转到工单信息:xxy
    @RequestMapping("/orderInfo")
    public String orderInfo(){
        return "/page/be_orderInfo";
    }

    //跳转到初步审核:yjh
    @RequestMapping("/auditForm")
    public String auditForm(){
        return "/page/be__auditForm";
    }

    //跳转到档案存档:yjh
    @RequestMapping("/saveForm")
    public String saveForm(){
        return "/page/be__saveForm";
    }

    //跳转到供水协议:yjh
    @RequestMapping("/beContractForm")
    public String contractForm(){
        return "/page/be__contractForm";
    }


}
