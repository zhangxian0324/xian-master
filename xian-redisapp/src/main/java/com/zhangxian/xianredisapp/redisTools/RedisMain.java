package com.zhangxian.xianredisapp.redisTools;

import java.util.HashMap;
import java.util.Map;

public class RedisMain {
    public static void main(String[] args) {

        Map<String,String> map01 = new HashMap<>();

        Map<String,String> map02 = new HashMap<>();

        map01.put("01","1212");
        map01.put("02","1212");
        map01.put("03","1212");
//        map01.put("04","1212");
        map01.put("05","1212");
        map01.put("06","1212");
        map01.put("07","1212");

        map02.put("01","1212");
        map02.put("02","1212");
        map02.put("03","1212");
        map02.put("04","1212");
        map02.put("05","1212");
        map02.put("06","1212");
        map02.put("07","1212");

        boolean sucucess = map01.equals(map02);
        System.out.println("===========:" + sucucess);


    }
}
