package com.xiancommon.utils.concurrent;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1,3).mapToObj(ThreadJoin::create).collect(toList());
        threads.forEach(Thread::start);
        for(Thread thread:threads) {
            thread.join();
        }
        for (int i = 0;i < 10;i++) {
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
        }
    }
    private static Thread create(int seq) {
        return new Thread(() -> {
            for (int i = 0;i < 10;i++) {
                System.out.println(Thread.currentThread().getName() + "#" + i);
                try {
                    shortSleep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },String.valueOf(seq));
    }

    private static void shortSleep() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }
}

