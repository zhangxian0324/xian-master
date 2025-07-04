package com.xiancommon.dataStructure;

import org.openjdk.jol.info.ClassLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author zhangxian
 */
public class MapUtil {
    private final static Logger log = LoggerFactory.getLogger("MapUtil.class");
    private static final int MAX_NUM = 10;
    static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        for(long i = 0;i < 10000000;i++) {
            hashSet.add(11111111111L + i + "");
        }
        System.out.println(hashSet.size());
        System.out.println(ClassLayout.parseInstance(hashSet).toPrintable());
//        printMap();
        // tableSizeFor(18000);
    }


    private static void printMap() {
        for (int i = 0;i < MAX_NUM;i++) {
            map.put(String.valueOf(i),i);
        }
        log.info("keySet:");
        for(String item : map.keySet()) {
            System.out.print(item + "=" + map.get(item) + " ");
        }
        log.info("\nentrySet:");
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        log.info("\nIterator:");
        for (Map.Entry<String, Integer> next : map.entrySet()) {
            System.out.print(next.getKey() + "=" + next.getValue() + " ");
        }
        log.info("\nvalues:");
        for (int i : map.values()) {
            System.out.print(i);
        }

        // lambda
        map.forEach((k,v)-> log.info(k + "=" +v + " "));

    }

    static int tableSizeFor(int cap) {
        int n = cap - 1;
        log.info("n’binary = " + Integer.toBinaryString(n));
        n |= n >>> 1;
        log.info("n’binary = " + Integer.toBinaryString(n));
        log.info("n = " + n);
        n |= n >>> 2;
        log.info("n = " + n);
        n |= n >>> 4;
        log.info("n = " + n);
        n |= n >>> 8;
        log.info("n = " + n);
        n |= n >>> 16;
        log.info("n = " + n);
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }



}
