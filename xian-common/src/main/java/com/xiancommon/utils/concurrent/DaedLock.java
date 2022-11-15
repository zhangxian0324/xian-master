package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangxian
 */
public class DaedLock {
    private final static Logger log = LoggerFactory.getLogger("DaedLock.class");

    private static Integer i1 = new Integer("11");
    private static Integer i2 = new Integer("22");
    public static void main(String[] args) {
        Thread thread01 = new Thread(() -> {
           synchronized (i1) {
               log.info("t1 Integer");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (i2) {
                   log.info("t1 Long");
               }
           }

        });
        thread01.start();

        Thread thread02 = new Thread(() -> {
            synchronized (i2) {
                log.info("t2 Long");
                synchronized (i1) {
                    log.info("t2 Integer");
                }
            }

        });
        thread02.start();
    }

}
