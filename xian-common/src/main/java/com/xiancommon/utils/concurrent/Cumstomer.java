package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Cumstomer implements Runnable {
    private final static Logger log = LoggerFactory.getLogger("Cumstomer.class");

    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(100);

    public Cumstomer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        if (!blockingQueue.isEmpty()) {
            log.info(String.valueOf(blockingQueue.remove()));
        }
    }
}
