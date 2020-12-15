package com.zhibang.controller.bes;

import com.zhibang.model.SyMetertype;
import com.zhibang.service.sy.MetertypeService;
import com.zhibang.service.sy.impl.MetertypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName RequestController.java
 * @Description TODO
 * @createTime 2020年12月14日 10:19:00
 */

@Controller
@RequestMapping("/be")
public class RequestController {

    @Autowired
    public MetertypeService metertypeService;

    //跳转用户申请界面
    @GetMapping(value = "/request")
    public String request(){
        return  "/page/be__request";
    }

    //跳转选择办理业务
    @GetMapping(value = "/requestInt")
    public String requestInt(Integer rid, Model model){
        List<SyMetertype> syMetertypes = metertypeService.selSyMetertype();
        model.addAttribute("syMetertypes", syMetertypes);
        String requestId = "/page/be__request" + rid;
        return requestId;
    }

}
