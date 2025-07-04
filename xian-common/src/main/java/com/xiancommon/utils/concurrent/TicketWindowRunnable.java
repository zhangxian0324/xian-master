package com.xiancommon.utils.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author zhangxian
 */
public class TicketWindowRunnable implements Runnable {
    private final static Logger log = LoggerFactory.getLogger("TicketWindowRunnable.class");

    private int index = 1;
    private final static int MAX = 5;
    private final static Object MUTEX = new Object();
    @Override
    public void run() {
        synchronized (MUTEX) {
            while (index <= MAX) {
                log.info(Thread.currentThread().getName() + "的号码是：" + (index++));
            }
        }
    }

    public static void main(String[] args) {
        final TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();
        Thread thread1 = new Thread(ticketWindowRunnable,"一号窗口");
        Thread thread2 = new Thread(ticketWindowRunnable,"二号窗口");
        Thread thread3 = new Thread(ticketWindowRunnable,"三号窗口");
        Thread thread4 = new Thread(ticketWindowRunnable,"四号窗口");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


}
