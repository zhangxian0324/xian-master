package com.xiancommon.utils.niuke2025;

import java.util.Scanner;

/**
 * @author zhang
 *
 */
public class Huawei01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String validRe = validIP(s);
        if (!"valid".equals(validRe)){
            System.out.println(validRe);
            return;
        }
        String[] ips = s.split("\\#");
        long ipvals = 0;
        for(int i = 0;i < 4;i++) {
            ipvals = ipvals *256 + Integer.parseInt(ips[i]);
        }
        System.out.println(validRe);
        System.out.println(ipvals);
    }

    public static String validIP(String ip) {
        String result = "invalid IP";
        if (ip == null || ip.length() == 0) {
            return "invalid IP";
        }
        try {
            String[] ips = ip.split("\\#");
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            if (ips.length == 4) {
                int first = Integer.parseInt(ips[0]);
                int second = Integer.parseInt(ips[1]);
                int third = Integer.parseInt(ips[2]);
                int fourth = Integer.parseInt(ips[3]);
                flag = true;
                if (first >=1 && first <= 128) {
                    flag1 = true;
                }
                if (second >= 0 && second <= 255) {
                    flag2 = true;
                }
                if (third >= 0 && third <= 255) {
                    flag3 = true;
                }
                if (fourth >= 0 && fourth <= 255) {
                    flag4 = true;
                }
            }
            if (flag && flag1 && flag2 && flag3 && flag4) {
                return "valid";
            }

        } catch (Exception e) {

        }
        return "invalid IP";
    }
}
