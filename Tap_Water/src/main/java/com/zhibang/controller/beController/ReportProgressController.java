package com.zhibang.controller.beController;

import com.zhibang.mapper.beMapper.CountMapper;
import com.zhibang.model.BeFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/be")
public class ReportProgressController {

    @Autowired
    private CountMapper countMapper;

    //跳转业扩工程进度页面:xxy
    @RequestMapping("/reportProgress")
    public String beOrder(Model model){
        //获得流程表中所有的流程，转数组
        List<BeFlow> list = countMapper.selectIdBeFlow();
        Integer[] stepId = new Integer[list.size()];
        int step=0;
        for (BeFlow beFlow : list) {
            stepId[step] = beFlow.getId();
            step++;
        }
        //定义用户类型，固定数据1、2、3、4、5、6、7
        Integer[] orderTypes = {1,2,3,4,5,6,7};

        //将数据依次传入集合中
        List<Map<String, Object>> count = new ArrayList<>();
        for (int i = 0; i < stepId.length; i++) {
            Map<String, Object> stepIdAndOrdertype = new HashMap<>();
            stepIdAndOrdertype.put("stepId", stepId[i]);
            int sun = 0;
            for (int j = 0; j < orderTypes.length; j++) {
                String value = countMapper.countOrderNo(stepId[i], orderTypes[j]);
                String key = "type" + orderTypes[j];
                sun = sun + Integer.parseInt(value);
                stepIdAndOrdertype.put(key, value);
            }
            stepIdAndOrdertype.put("sun", sun);
            count.add(stepIdAndOrdertype);
        }

        model.addAttribute("count", count);
//        for (Map<String, Object> stringObjectMap : count) {
//            System.out.println(stringObjectMap);
//        }

        return "/page/be_reportProgress";
    }

}
