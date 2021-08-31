package com.xiancommon.utils.concurrent;

/**
 * @author zhangxian
 */
public class DaedLock {
    private static Integer i1 = new Integer("11");
    private static Integer i2 = new Integer("22");
    public static void main(String[] args) {
        Thread thread01 = new Thread(() -> {
           synchronized (i1) {
               System.out.println("t1 Integer");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (i2) {
                   System.out.println("t1 Long");
               }
           }

        });
        thread01.start();

        Thread thread02 = new Thread(() -> {
            synchronized (i2) {
                System.out.println("t2 Long");
                synchronized (i1) {
                    System.out.println("t2 Integer");
                }
            }

        });
        thread02.start();
    }

}
