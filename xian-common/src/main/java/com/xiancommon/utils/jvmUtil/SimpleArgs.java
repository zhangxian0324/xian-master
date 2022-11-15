package com.xiancommon.utils.jvmUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleArgs {
    private final static Logger log = LoggerFactory.getLogger("SimpleArgs.class");

    public static void main(String[] args) {
        for (int i = 0;i < args.length;i++) {
            log.info("参数" + (i + 1) + ":" + args[0]);
        }
        log.info("-Xmx" + Runtime.getRuntime().maxMemory()/ 1024 / 1024 + "M");
    }
}
