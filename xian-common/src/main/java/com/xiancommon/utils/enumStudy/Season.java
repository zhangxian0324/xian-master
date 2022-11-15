package com.xiancommon.utils.enumStudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zhangxian
 */

public enum Season {
    /**
     * 春天
     */
    SPRING(1,"春天"),
    /**
     *夏天
     */
    SUMMER(2,"夏天"),
    /**
     * 秋天
     */
    AUTUMN(3,"秋天"),
    /**
     * 冬天
     */
    WINTER(4,"冬天");
    private int val;
    private String  dec;
    public Season getSeason(Season season) {
        return season;
    }
    Season(int val,String dec) {
        this.val = val;
        this.dec = dec;
    }
    Season(int aa) {
        this.val  = aa;
    }
    @Override
    public String toString() {
        return this.val + ":" + this.dec;
    }

}
