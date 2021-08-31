package com.zhangxian.xianwebapp.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class StringUtil {
    public static void main(String[] args) {
/*
        HashMap<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        print("".equals(map.get("xian")));
*/


        int a = 1;
        int b = 2;
        int c = a & 1; // and
        int d = c ^ b; // 异或
        int e = c | b; // or

        int f = a % 1; // 求余

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        List<Integer> arr = new LinkedList();
        ArrayList<Integer> arr1 = new ArrayList();
        arr.add(11);
        arr1.add(222);
        System.out.printf("linked list : " + arr.get(0));
        System.out.println();
        System.out.printf("array list : " + arr1.get(0));

        HashMap<String,String>  map = new HashMap<>();
    }

    private static void print(Object s) {
        System.out.println(s);
        
    }

    final String get() {
        return "11";
    }

}
