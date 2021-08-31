package com.zhangxian.xianwebapp.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberUtil {
    private static Logger logger = LoggerFactory.getLogger(NumberUtil.class);

    public static void main(String[] args) {
        int a = -3;
        logger.info("" + Integer.toBinaryString(a));
        short s = 1;
        logger.info("" + s);
    }



}
