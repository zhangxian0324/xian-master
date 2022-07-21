package com.xiancommon.utils.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangxian
 */
public class ThreadSleep {

    public static void createTread(){
        new Thread(() ->{
           long startTime = System.currentTimeMillis();
            sleep(2000L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms",(endTime - startTime)));

        }).start();
        long startTime = System.currentTimeMillis();
        sleep(3000L);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Total spend %d ms",(endTime - startTime)));
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
