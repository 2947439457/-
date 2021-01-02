package com.zhibang.utils;

import com.zhibang.mapper.beMapper.OrderMapper;
import com.zhibang.mapper.usMapper.MeterMapper;
import com.zhibang.mapper.usMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Common.java
 * @Description TODO 工具类
 * @createTime 2020年12月16日 15:09:00
 */
@Component
public class Common {

    @Autowired private UserMapper userMapper;
    @Autowired private OrderMapper orderMapper;
    @Autowired private MeterMapper meterMapper;

    //生成用户编号
    public String UserNo(Integer orderType){
        String s = userMapper.selectUserNo(orderType);
        Integer a = 0;
        if (s == null || s.equals(null) || s.equals("")){
            a = 1;
        }else{
            a = Integer.parseInt(s);
            a++;
        }
        String ss = "";
        if(a<10){
            ss = "0"+orderType+"0000000"+a;
        }else if(a>=10 && a<=99){
            ss = "0"+orderType+"000000"+a;
        }else if (a>=100 && a<=999){
            ss = "0"+orderType+"00000"+a;
        }else if (a>=1000 && a<=9999){
            ss = "0"+orderType+"0000"+a;
        }
        return ss;
    }

    //生成业扩工单
    public String OrderNo(Integer orderType){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String format1 = formatter.format(date);
        String s = orderMapper.selectOrderNo("B" + orderType);
        Integer a ;
        if (s == null || s.equals(null) || s.equals("")){
            a = 1;
        }else{
            a = Integer.parseInt(s);
            a++;
        }
        String ss = "";
        if(a<10){
            ss = "B"+orderType+"-"+format1+"-000"+a;
        }else if(a>=10 && a<=99){
            ss = "B"+orderType+"-"+format1+"-00"+a;
        }else if (a>=100 && a<=999){
            ss = "B"+orderType+"-"+format1+"-0"+a;
        }
        return ss;
    }

    //生成水表编号
    public String MeterNo(String userNo){
        String s = meterMapper.selectMeterNo(userNo);
        Integer a = 0;
        if (s == null || s.equals(null) || s.equals("")){
            a = 1;
        }else{
            a = Integer.parseInt(s);
            a++;
        }
        String ss = "";
        if (a>=1 && a<10){
            ss = "M"+userNo+"-0"+a;
        }else if (a>=10 && a<100){
            ss = "M"+userNo+"-"+a;
        }
        return ss;
    }

}
