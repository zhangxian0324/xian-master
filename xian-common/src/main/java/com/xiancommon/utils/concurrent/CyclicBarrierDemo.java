package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zhangxian
 */
public class CyclicBarrierDemo {
    private final static Logger log = LoggerFactory.getLogger("CyclicBarrierDemo.class");

    public static class Soldier implements Runnable {
        private String soldier;
        private final CyclicBarrier cyclicBarrier;

        Soldier(CyclicBarrier cyclicBarrier,String soldierName) {
            this.cyclicBarrier = cyclicBarrier;
            this.soldier = soldierName;
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
                doWork();
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e1) {
                e1.printStackTrace();
            }
        }

        public void doWork() {
            try {
                Thread.sleep(Math.abs(new Random().nextInt() % 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info(soldier + ":任务完成");
        }


    }

    public static class BarrierRun implements Runnable {
        boolean flag;
        int N;
        public BarrierRun(boolean flag,int N) {
            this.flag = flag;
            this.N = N;
        }
        @Override
        public void run() {
            if (flag) {
                log.info("司令:【士兵" + N + "个，任务完成！】");
            } else {
                log.info("司令:【士兵" + N + "个，集合完成！】");
                flag = true;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final int N = 10;
        Thread[] allSoldier = new Thread[N];
        boolean flag = false;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N,new BarrierRun(flag,N));
        log.info("集合队伍！");
        for (int i = 0;i < N ;++i) {
            log.info("士兵 " + i + " 报到");
            allSoldier[i] = new Thread(new Soldier(cyclicBarrier,"士兵 " + i));
            allSoldier[i].start();
        }
    }
}
