package com.xiancommon.utils.CaluUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author zhangxian
 */
public class CalUtil {
    private final static Logger log = LoggerFactory.getLogger("CalUtil.class");

    public static void main(String[] args) {
        BigDecimal b_2 = new BigDecimal("234444444444444444444444444444444444444444432424323244444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        BigDecimal b_1 = new BigDecimal("1.67567500000000000000000000000000000000000");
        BigDecimal b_3 = b_1.multiply(b_2);
        log.info("" + b_2.toBigInteger());
        log.info("b_1 + b_2 = " + b_3);

    }
}
