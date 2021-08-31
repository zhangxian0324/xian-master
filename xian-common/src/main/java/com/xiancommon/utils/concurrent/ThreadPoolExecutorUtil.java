package com.xiancommon.utils.concurrent;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangxian
 */
public class ThreadPoolExecutorUtil {
    public static void create() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
                3,
                1000,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue(2), new ThreadPoolExecutor.AbortPolicy());

    }

}
