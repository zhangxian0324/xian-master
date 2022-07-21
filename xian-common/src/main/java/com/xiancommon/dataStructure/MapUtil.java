package com.xiancommon.dataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zhangxian
 */
public class MapUtil {
    static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        printMap();
        // tableSizeFor(18000);
    }


    private static void printMap() {
        for (int i = 0;i < 10;i++) {
            map.put(String.valueOf(i),i);
        }
        System.out.println("keySet:");
        for(String item : map.keySet()) {
            System.out.print(item + "=" + map.get(item) + " ");
        }
        System.out.println("\nentrySet:");
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println("\nIterator:");
        Iterator<Map.Entry<String,Integer>> iterators = map.entrySet().iterator();
        while(iterators.hasNext()) {
            Map.Entry<String,Integer> next = iterators.next();

            System.out.print(next.getKey() + "=" + next.getValue() + " ");
        }
        System.out.println("\nvalues:");
        for (int i : map.values()) {
            System.out.print(i);
        }

        // lambda
        map.forEach((k,v)-> System.out.println(k + "=" +v + " "));

    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        System.out.println("n’binary = " + Integer.toBinaryString(n));
        n |= n >>> 1;
        System.out.println("n’binary = " + Integer.toBinaryString(n));
        System.out.println("n = " + n);
        n |= n >>> 2;
        System.out.println("n = " + n);
        n |= n >>> 4;
        System.out.println("n = " + n);
        n |= n >>> 8;
        System.out.println("n = " + n);
        n |= n >>> 16;
        System.out.println("n = " + n);
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }



}
