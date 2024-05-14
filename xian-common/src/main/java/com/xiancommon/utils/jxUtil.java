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
        if (mystr== null || mystr.length() < 4) {
            return 0;
        }
        String mystrLow = mystr.toLowerCase();
        int len = mystrLow.length();
        List<Character> list = new ArrayList<Character>();
        for(int i = 0;i < len;i++){
            char ch = mystrLow.charAt(i);
            if(ch == 'c' || ch == 'b' || ch == 'f' || ch == 't'){
                list.add(mystrLow.charAt(i));
                break;
            }
        }
        resultInt = list.size() / 4;
        return list.size() / 4;
    }
}
