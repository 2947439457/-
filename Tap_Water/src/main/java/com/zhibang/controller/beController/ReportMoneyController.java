package com.zhibang.controller.beController;

import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/be")
public class ReportMoneyController {

    @Autowired
    private OrderService orderService;

    /**
     * 跳转到工单管理:xxy
     */
    @RequestMapping("/reportMoney")
    public String beOrder(Model model, String orderType, String time1, String time2){
        //工单管理：xxy
        List<BeOrder> user = orderService.queryAllOrder(null, null, null, null);
        model.addAttribute("user",user);
        Double i = orderService.selSumMoney("", "", "");
        model.addAttribute("sumMoney", i);
        return "/page/be_reportMoney";
    }

    // 业扩收费报表查询：xxy
    @ResponseBody
    @RequestMapping("/ordMon")
    public Map<String, Object> selMoney(Model model, String orderType, String time1, String time2){
        List<BeOrder> user = orderService.selAllOrder(orderType, time1, time2);
        System.out.println(orderType+","+time1+","+time2);
        Double i = orderService.selSumMoney(orderType, time1, time2);
        model.addAttribute("sumMoney", i);
        Map<String, Object> map = new HashMap<>();
        map.put("sumMoney", i);
        map.put("user", user);
        for (BeOrder l : user) {
            System.out.println(l);
        }
        return map;
    }

//    //业扩收费查询总交费:xxy
//    public double selSumMon(Model model, String orderType, String time1, String time2){
//        double i = orderService.selSumMoney(orderType, time1, time2);
//        model.addAttribute("sumMoney", i);
//        System.out.println(i);
//        return i;
//    }

}
