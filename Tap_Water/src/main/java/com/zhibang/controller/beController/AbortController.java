package com.zhibang.controller.beController;

import com.zhibang.model.BeOrder;
import com.zhibang.service.beService.AbortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/be")
public class AbortController {

    @Autowired
    private AbortService abortService;

    //跳转到终止工单(abort)页面
    @RequestMapping("/abort")
    public String beOrder(){
        return "/page/be_abort";
    }

    @ResponseBody
    @RequestMapping("/selAbort")
    public BeOrder selBorder(String orderNoText){
        BeOrder beOrder = abortService.queryByOrder(orderNoText);
        return beOrder;
    }

}
