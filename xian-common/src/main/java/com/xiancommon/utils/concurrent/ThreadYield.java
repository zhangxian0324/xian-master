package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class ThreadYield {
    private final static Logger log = LoggerFactory.getLogger("ThreadYield.class");

    public static void main(String[] args) {
        IntStream.range(0,2).mapToObj(ThreadYield::create).forEach(Thread::start);
    }
    private static Thread create(int index) {
        return new Thread(() -> {
            if (index == 0) {
                Thread.yield();
            }
            log.info("",index + "");
        });
    }
}
