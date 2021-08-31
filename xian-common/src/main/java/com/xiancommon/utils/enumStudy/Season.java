package com.xiancommon.utils.enumStudy;

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

    public static void main(String[] args) {
       // System.out.println(Season.SPRING.toString());
       System.out.println(Season.SPRING.name());

       for (Season season : Season.values()) {
           System.out.println(season);
       }

        EnumMap<Season,String> map = new EnumMap<>(Season.class);
       map.put(Season.SPRING,"Spring");
       map.put(Season.SUMMER,"SUMMER");
       map.put(Season.AUTUMN,"AUTUMN");
       map.put(Season.WINTER,"WINTER");
       Iterator<Map.Entry<Season,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())  {
            Map.Entry<Season,String> item = iterator.next();
            System.out.println(item.getKey().name() + "==" + item.getValue());
        }

    }

}
