package com.cqupt.zyx.Controller.Converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 数据绑定时将字符串转化为Date
 * */
public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date target = simpleDateFormat.parse(s);
            return target;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
