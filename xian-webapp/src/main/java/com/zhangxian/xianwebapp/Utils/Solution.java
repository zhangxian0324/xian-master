package com.zhangxian.xianwebapp.Utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 统计有多少字符个数，按照空格去分割。
 */
public class Solution {
    private final static Logger log = LoggerFactory.getLogger("Util.class");

    public static void main(String[] args) {
        String i = "1";
        int j = i.hashCode() ^ (i.hashCode() >>> 16);
        log.info(" i.hashcode()  = " + i.hashCode());
        log.info(" j  = " + j);
    }
}
