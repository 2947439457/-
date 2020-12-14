package com.zhibang.controller.bes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

    //跳转用户申请界面
    @GetMapping(value = "/request")
    public String request(){
        return  "/page/be__request";
    }

    //选择办理用户
    @GetMapping(value = "/requestInt")
    public String requestInt(Integer rid){
        String requestId = "/page/be__request" + rid;
        System.out.println(requestId);
        return requestId;
    }

}
