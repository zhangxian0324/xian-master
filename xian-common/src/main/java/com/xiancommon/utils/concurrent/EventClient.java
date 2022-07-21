package com.xiancommon.utils.concurrent;

import java.util.concurrent.TimeUnit;

public class EventClient {
    public static void main(String[] args) {
        final EventQueue eventQueue = new EventQueue();
        new Thread(() ->{
            for (;;) {
                eventQueue.offer(new EventQueue.Event());
            }
        },"Producer").start();

        new Thread(() ->{
            for (;;) {
                try {
                    eventQueue.take();
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Consumer").start();
    }
}
