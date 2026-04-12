package com.xiancommon.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class jxUtil {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param mystr string字符串
     * @return int整型
     */
    public int countSeq (String mystr) {
        String sampleStr = "ccbft";
        int resultInt = 0;
        if (mystr == null || mystr.length() < sampleStr.length()) {
            return 0;
        }
        String mystrLow = mystr.toLowerCase();
        int count = 0;
        int index = 0;

        while ((index = mystrLow.indexOf(sampleStr, index)) != -1) {
            count++;
            index += sampleStr.length(); // Move past the current match
        }

        return count;
    }
}
