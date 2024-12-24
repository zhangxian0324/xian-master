package com.xiancommon.utils.huawei2227;

import java.util.Scanner;

public class Zuobiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.next();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
