package com.xiancommon.utils.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Cumstomer implements Runnable {
    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(100);

    @Override
    public void run() {

    }
}
