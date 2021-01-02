package com.zhibang.controller.beController;

import com.zhibang.model.BeOrder;
import com.zhibang.model.SyEmp;
import com.zhibang.service.beService.AbortService;
import org.apache.logging.log4j.core.config.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/be")
public class AbortController {

    @Autowired
    private AbortService abortService;
    @Autowired
    private BeOrder beOrder;

    //跳转到终止工单(abort)页面
    @RequestMapping("/abort")
    public String abort(){
        return "/page/be_abort";
    }

    @ResponseBody
    @RequestMapping("/selAbort")
    public BeOrder selBorder(String orderNoText){
        BeOrder beOrder = abortService.queryByOrder(orderNoText);
        System.out.println(beOrder);
        return beOrder;
    }

    @ResponseBody
    @RequestMapping("/because")
    public int upOrderOver(String overBecause, String orderNoText, HttpSession session){
        BeOrder uporder = beOrder;
        SyEmp sy= (SyEmp) session.getAttribute("s");
        uporder.setLastEditEmp(sy);
        uporder.setAbortCause(overBecause);
        uporder.setOrderNo(orderNoText);
        int i = abortService.upByOrder(uporder);
        return i;
    }

}
