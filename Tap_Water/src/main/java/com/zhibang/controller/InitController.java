package com.zhibang.controller;

import com.zhibang.controller.beController.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName InitController.java
 * @Description TODO
 * @createTime 2020年12月11日 09:34:00
 */
@Controller
@RequestMapping("/be")
public class InitController {

    @Autowired private AuditController auditController;
    @Autowired private PayController payController;
    @Autowired private RequestController requestController;
    @Autowired private BillclearController billclearController;
    @Autowired private ContractController contractController;
    @Autowired private WorkingController workingController;
    @Autowired private OpenController openController;
    @Autowired private SaveContorller saveContorller;

    //对业扩流程操作进行处理
    @RequestMapping("/chuLi")
    public String chuLi(String stepName, String orderNo, Integer orderType, String userName, Model model){
        String path = "";
        if("用户申请".equals(stepName)){
            path = requestController.requestOrderJudge(orderNo, orderType, model);
        }
        if("初步审核".equals(stepName)){
            path = auditController.auditForm(orderNo, userName, orderType, model);
        }
        if("交施工费".equals(stepName)){
            path = payController.payForm(orderNo, model);
        }
        if("水费清算".equals(stepName)){
//            path = billclearController.billclearForm(orderNo, model);
        }
        if ("供水协议".equals(stepName)){
            path = contractController.contarctForm(orderNo, model);
        }
        if ("施工竣工".equals(stepName)){
            path = workingController.workingForm(orderNo, model);
        }
        if ("通水停水".equals(stepName)){
            path = openController.openForm(orderNo, model);
        }
        if ("档案存档".equals(stepName)){
            path = saveContorller.saveForm(orderNo, model);
        }
        return path;
    }

}
