package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangxian
 */
public class CountDownLatchDemo implements Runnable{
    private final static Logger log = LoggerFactory.getLogger("CountDownLatchDemo.class");

    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();
    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10) * 1000);
            log.info("check complete...");
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0;i < 10;i++) {
            executorService.submit(demo);
        }
        end.await();
        log.info("Fire!!!");
        executorService.shutdown();

    }
}
