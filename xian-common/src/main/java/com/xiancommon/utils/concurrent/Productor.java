package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Productor implements Runnable {
    private final static Logger log = LoggerFactory.getLogger("Productor.class");

    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(100);
    public Productor(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            blockingQueue.offer(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        switchTest();
    }

    public static void switchTest() {
        String a = "1";
        switch (a) {
            case "1":
                log.info("a");
                break;
            case "2":
                log.info("b");
                break;
            case "3":
                log.info("c");
                break;
            case "4":
                log.info("d");
                break;
            case "5":
                log.info("e");
                break;
            default:
                log.info("default");
        }
    }
}
