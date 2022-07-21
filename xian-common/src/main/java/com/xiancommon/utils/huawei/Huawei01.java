package com.xiancommon.utils.huawei;

import java.util.Scanner;

/**
 * @author zhangxian
 */
public class Huawei01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String targetStr = in.next();
        System.out.println(find(str,targetStr));
    }

    public static int find(String str,String target) {
        System.out.println("str: " + str);
        System.out.println("target: " + target);
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
