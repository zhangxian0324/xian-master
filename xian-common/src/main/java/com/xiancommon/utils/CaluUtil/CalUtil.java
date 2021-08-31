package com.xiancommon.utils.CaluUtil;

import java.math.BigDecimal;

/**
 * @author zhangxian
 */
public class CalUtil {

    public static void main(String[] args) {
        BigDecimal b_2 = new BigDecimal("234444444444444444444444444444444444444444432424323244444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        BigDecimal b_1 = new BigDecimal("1.67567500000000000000000000000000000000000");
        BigDecimal b_3 = b_1.multiply(b_2);
        System.out.println("" + b_2.toBigInteger());
        System.out.println("b_1 + b_2 = " + b_3);

    }
}
