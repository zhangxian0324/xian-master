package com.xiancommon.utils.algorithm.digitUtil;

/**
 * @author zhangxian
 */
public class DigitUtil {
    public static int solution(String s) {
        if (s == null || s.trim() == "") {
            return 0;
        }
        char[] arr = s.toCharArray();
        StringBuffer sb = new StringBuffer("");
        char temp = '-';
        for (int i = 0;i < s.length();i++) {
            char temp1 = arr[i];
            if (Character.isDigit(temp1)){
            }
        }
        return 0;
    }
}
