package com.xiancommon.utils.StringUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StringUtil {
    private final static Logger log = LoggerFactory.getLogger("StringUtil.class");
    public static ThreadPoolExecutor threadPoolExecutor;
    static {
        threadPoolExecutor = new ThreadPoolExecutor(2, 100,1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    }

    public static void main(String[] args) {
        int num_1 = 6;
        int num_2 = 6;
        if (num_2 >= num_1){
            log.info("this is true");
        } else {
            log.info("this is false");
        }
    }


    public static int getRandom() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(100000));
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(list.size());
        log.info(""+randomIndex);
        return list.get(randomIndex);
    }


}
