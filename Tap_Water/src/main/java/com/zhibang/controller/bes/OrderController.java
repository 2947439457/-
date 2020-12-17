package com.zhibang.controller.bes;

import com.zhibang.model.BeFlow;
import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String beOrder(Model model){
        //工单管理：xxy
        List<BeOrder> user = orderService.queryAllOrder();
        model.addAttribute("user",user);
//        for (BeOrder order : user) {
//            System.out.println(order.getOrderNo()+","+order.getOrderType()+","+order.getLastEditDate()+order.getStepId().getStepName()
//                    +","+order.getStepId().getDeptId().getDeptName()+","+order.getUserNo().getUserName());
//        }
        //查询工单进度：xxy
        List<BeFlow> bf = orderService.queryStepNameType();
        model.addAttribute("bf",bf);
        for (BeFlow flow : bf) {
            System.out.println(flow);
        }

        return "/page/be_order";
    }

    //跳转到工单信息:xxy
    @RequestMapping("/orderInfo")
    public String orderInfo(){
        return "/page/be_orderInfo";
    }

    //跳转到初步审核
    @RequestMapping("/auditForm")
    public String auditForm(){
        return "/page/be__auditForm";
    }

    //跳转到档案存档
    @RequestMapping("/saveForm")
    public String saveForm(){
        return "/page/be__saveForm";
    }

    //跳转到供水协议
    @RequestMapping("/beContractForm")
    public String contractForm(){
        return "/page/be__contractForm";
    }


}
