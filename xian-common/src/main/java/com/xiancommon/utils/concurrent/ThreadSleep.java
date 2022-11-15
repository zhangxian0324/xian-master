package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangxian
 */
public class ThreadSleep {
    private final static Logger log = LoggerFactory.getLogger("ThreadSleep.class");

    public static void createTread(){
        new Thread(() ->{
           long startTime = System.currentTimeMillis();
            sleep(2000L);
            long endTime = System.currentTimeMillis();
            log.info(String.format("Total spend %d ms",(endTime - startTime)));

        }).start();
        long startTime = System.currentTimeMillis();
        sleep(3000L);
        long endTime = System.currentTimeMillis();
        log.info(String.format("Total spend %d ms",(endTime - startTime)));
    }

    public static void sleep(long time) {
        try {
          //  Thread.sleep(time);
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createTread();
    }
}
