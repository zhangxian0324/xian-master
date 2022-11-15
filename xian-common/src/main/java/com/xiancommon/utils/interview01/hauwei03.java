package com.xiancommon.utils.interview01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zhangxian
 */
public class hauwei03 {
    private final static Logger log = LoggerFactory.getLogger("hauwei03.class");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        log.info(string);
        char[] arr = string.toCharArray();
        StringBuffer s = new StringBuffer();
        for (int i = 0;i < arr.length -1;i++) {
            if ("#".equals(String.valueOf(arr[i]))){
                int n = Integer.valueOf(String.valueOf(arr[i]));
                String temp = chang(n);
                String[] arr1 = temp.split("");
                String temp02 = "";
                if (arr[i] == arr[i+1]) {
                   temp02 = temp.split("")[i % arr.length];
                } else {
                    temp02 = temp.split("")[0];
                }
                s.append(arr[i]);

            } else {
                s.append(arr[i]);
            }
        }
        log.info(s.toString());

    }

    public static String chang(int num) {
        HashMap<Integer,String> map = new HashMap<>(16);
        map.put(1,",.");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jki");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        return map.get(num);
    }
}
