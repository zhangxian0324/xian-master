package com.zhangxian.xianwebapp.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtil {
    private final static Logger logger =  LoggerFactory.getLogger(MapUtil.class);
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        for (String k : map.keySet()) {
            logger.info("k:" + map.get(k));
        }
        // in
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        for (Iterator<Map.Entry<String, String>> it = iterator; it.hasNext(); ) {
            Entry<String, String> obj = it.next();
            logger.info("" + obj.getKey());
            logger.info("" + obj.getValue());
        }
    }
}
