package com.xiancommon.utils.jvmUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackDeep {
    private final static Logger log = LoggerFactory.getLogger("StackDeep.class");

    private static int count = 0;
    public static void recursion() {
        count++;
        recursion();
    }
    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            log.info("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}
