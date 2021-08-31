package com.zhangxian.xianwebapp.Utils;


/**
 * 统计有多少字符个数，按照空格去分割。
 */
public class Solution {
    public static void main(String[] args) {
        String i = "1";
        int j = i.hashCode() ^ (i.hashCode() >>> 16);
        System.out.println(" i.hashcode()  = " + i.hashCode());
        System.out.println(" j  = " + j);
    }
}
