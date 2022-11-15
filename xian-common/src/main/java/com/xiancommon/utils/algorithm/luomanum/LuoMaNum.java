package com.xiancommon.utils.algorithm.luomanum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxian
 */
public class LuoMaNum {
    public static String intToRoman(int num) {
        int[] basicVal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < basicVal.length;i++) {
            int val = basicVal[i];
            String s = str[i];
            while (num >= val) {
                num -= val;
                sb.append(s);
            }
            if (num == 0) {
                break;
            }
        }
        return  sb.toString();
    }

    public static int RomanToInt(String s) {
        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;

    }

}
