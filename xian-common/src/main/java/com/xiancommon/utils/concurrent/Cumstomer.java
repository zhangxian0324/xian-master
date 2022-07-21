package com.xiancommon.utils.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Cumstomer implements Runnable {
    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(100);

    public Cumstomer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        if (!blockingQueue.isEmpty()) {
            System.out.println(blockingQueue.remove());
        }
    }
}
