package com.zhibang.controller.beController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BillclearController.java
 * @Description TODO 水费清单
 * @createTime 2020年12月16日 01:36:00
 */
@Controller
@RequestMapping("/be")
public class BillclearController {

    //跳转水费清单界面:yjh
    @GetMapping("/billclear")
    public String billclear(){
        return "/page/be__billclear";
    }

    //跳转水费清单处理界面:yjh
    @GetMapping("/billclearForm")
    public String billclearForm(){
        return "/page/be__billclearForm";
    }

}
