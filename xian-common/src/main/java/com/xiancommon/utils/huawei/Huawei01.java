package com.xiancommon.utils.huawei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author zhangxian
 */
public class Huawei01 {
    private final static Logger log = LoggerFactory.getLogger("Huawei01.class");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String targetStr = in.next();
        log.info(find(str,targetStr) + "");
    }

    public static int find(String str,String target) {
        log.info("str: " + str);
        log.info("target: " + target);
        if(str == null || str.trim().length() == 0) {
            return -1;
        }
        int num = 0;
        for (int i = 0; i < str.length();i++) {
            if (target.equalsIgnoreCase(str.substring(i,i+1))) {
                num++;
            }
        }
        return num;
    }
}
