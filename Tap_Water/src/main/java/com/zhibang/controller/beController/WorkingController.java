package com.zhibang.controller.beController;

import com.alibaba.fastjson.JSONObject;
import com.zhibang.mapper.usMapper.MeterMapper;
import com.zhibang.model.*;
import com.zhibang.service.beService.OrderService;
import com.zhibang.service.beService.OrderUserService;
import com.zhibang.service.system.AreaService;
import com.zhibang.utils.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WorkingController.java
 * @Description TODO 施工竣工
 * @createTime 2020年12月29日 23:11:00
 */
@Controller
@RequestMapping("/be")
public class WorkingController {

    @Autowired private OrderService orderService;
    @Autowired private OrderUserService orderUserService;
    @Autowired private AreaService areaService;
    @Autowired private MeterMapper meterMapper;
    @Autowired private BeOrder beOrder;
    @Autowired private BeOrderuser beOrderuser;
    @Autowired private UsUser usUser;
    @Autowired private UsMeter usMeter;
    @Autowired private BeFlow beFlow;
    @Autowired private SyArea syArea;
    @Autowired private SyMetertype syMetertype;
    @Autowired private Common common;

    //跳转施工竣工页面:yjh
    @GetMapping("/working")
    public String working(Model model){
        List<BeOrder> beOrders = orderService.selBeOrderStepId(6, "1,2,5,6");
        model.addAttribute("beOrders", beOrders);
        return "/page/be__working";
    }

    //跳转施工竣工处理页面:yjh
    public String workingForm(String orderNo, Model model){
        BeOrder beOrder = orderService.selBeOrderOrderNo(orderNo);
        List<BeOrderuser> beOrderusers = orderUserService.selOrderuserOrderNo(orderNo);
        List<SyArea> syAreas = areaService.selectSyArea();
        model.addAttribute("beOrder", beOrder);
        model.addAttribute("beOrderusers", beOrderusers);
        model.addAttribute("syAreas", syAreas);
        return "/page/be__workingForm";
    }

    //处理
    @ResponseBody
    @RequestMapping(value = "/disposeWorking")
    public Integer disposeWorking(String stmt, String orderNo, Integer orderType, String userNo, Integer areaId,
                                  String projectDate1, String projectDate2, String orderUser, HttpSession httpSession){
        Integer integer = 0;
        try {
            BeOrder upBeOrder = beOrder;
            upBeOrder.setOrderNo(orderNo);
            upBeOrder.setOrderType(orderType);
            SyEmp upSyEmp = (SyEmp) httpSession.getAttribute("s");
            upBeOrder.setLastEditEmp(upSyEmp);

            upBeOrder.setProjectDate1(projectDate1);
            upBeOrder.setProjectDate2(projectDate2);

            SyArea upSyArea = syArea;
            upSyArea.setId(areaId);
            upBeOrder.setAreaId(upSyArea);

            UsUser upUsUser = usUser;
            upUsUser.setUserNo(userNo);
            upUsUser.setSyArea(upSyArea);

            List<BeOrderuser> list = JSONObject.parseArray(orderUser, BeOrderuser.class);
            int panDuan=0;
            for (BeOrderuser beOrderuser : list) {
                if (panDuan == 0){
                    UsMeter upUsMeter = usMeter;
                    upUsMeter.setMeterNo(common.MeterNo(userNo));
                    upUsMeter.setUserNo(upUsUser);
                    upUsMeter.setMeterName(beOrderuser.getMeterName());
                    SyMetertype upsyMetertype = syMetertype;
                    upsyMetertype.setId(beOrderuser.getMeterTypeId());
                    upUsMeter.setMeterTypeId(upsyMetertype);
                    upUsMeter.setMaxValue(beOrderuser.getMaxValue());
                    upUsMeter.setStartValue(beOrderuser.getStartValue());
                    upUsMeter.setFactory(beOrderuser.getMeterFactory());
                    UsMeter usMeter = meterMapper.selectUsMeterUserNo(userNo);
                    if (usMeter == null){
                        meterMapper.addUsMeter(upUsMeter);
                    }else{
                        meterMapper.upUsMeter(upUsMeter);
                    }
                }
                panDuan++;
                beOrderuser.setOrderNo(upBeOrder);
                Integer i = orderUserService.upOrderuserMeter(beOrderuser);
            }

            orderService.upOrderAndUserMeter(upBeOrder, upUsUser);
            BeFlow upstepId = beFlow;
            upstepId.setId(6);
            upBeOrder.setStepId(upstepId);
            integer = 1;
            if ("send".equals(stmt) || "recall".equals(stmt)){
                orderService.upBeOrderStepId(stmt, upBeOrder);
                integer = 2;
            }
        }catch (Exception e){
            integer = 3;
            e.printStackTrace();
        }
        return integer;
    }

}
