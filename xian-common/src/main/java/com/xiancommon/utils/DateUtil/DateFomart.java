package com.xiancommon.utils.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomart {

    public static String time0Format(String date,String parseType,String targetType) {
        if (date == null || date.trim().isEmpty()) {
            return "";
        }
        date = date.trim();
        SimpleDateFormat parse = new SimpleDateFormat(parseType);
        SimpleDateFormat target = new SimpleDateFormat(targetType);
        try {
            parse.setLenient(false);
            Date parseDate = parse.parse(date);
            System.out.println("parseDate: " + parseDate);
            String format = target.format(parseDate);
            System.out.println("format: " + format);
            return format;
        } catch (Exception e) {
            return "";
        }
    }
}
