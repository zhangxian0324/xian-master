package com.zhangxian.xianredisapp.redisTools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 */
public class RedisMain {
    private final static Logger log = LoggerFactory.getLogger("Serial.class");

    public static void main(String[] args) {

        Map<String,String> map01 = new HashMap<>(16);

        Map<String,String> map02 = new HashMap<>(16);

        map01.put("01","1212");
        map01.put("02","1212");
        map01.put("03","1212");
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

        boolean success = map01.equals(map02);
        log.info("===========:" + success);


    }
}
