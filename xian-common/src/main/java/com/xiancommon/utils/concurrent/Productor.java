package com.xiancommon.utils.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Productor implements Runnable {
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
                System.out.println("a");
                break;
            case "2":
                System.out.println("b");
                break;
            case "3":
                System.out.println("c");
                break;
            case "4":
                System.out.println("d");
                break;
            case "5":
                System.out.println("e");
                break;
            default:
                System.out.println("default");
        }
    }
}
