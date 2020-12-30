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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/be")
public class OrderController {

    @Autowired private OrderService orderService;

    /**
     * 跳转到工单管理:xxy
     */
    @RequestMapping("/order")
    public String beOrder(Model model){
        //工单管理：xxy
        List<BeOrder> user = orderService.queryAllOrder(null, null, null, null);
        model.addAttribute("user",user);
        return "/page/be_order";
    }

//    根据 工单类型 or 工程进度 or 工单号 or 用户姓名查询:xxy
    @ResponseBody
    @RequestMapping("/queryMany")
    public List<BeOrder> queryMany(String orderType, String stepName, String orderNo, String userName) {
        List<BeOrder> user = orderService.queryAllOrder(orderType, stepName, orderNo, userName);
        return user;
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
