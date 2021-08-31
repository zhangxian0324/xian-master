package com.zhangxian.xianwebapp.entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SHTeacher extends Teacher {
    private static Logger logger = LoggerFactory.getLogger(SHTeacher.class);
    static {
        logger.info("SHTeacher==============2");
    }

    public SHTeacher() {
        logger.info("SHTeacher构造器");
    }
    public void print() {
        logger.info("");
    }
    static {

    }
}
