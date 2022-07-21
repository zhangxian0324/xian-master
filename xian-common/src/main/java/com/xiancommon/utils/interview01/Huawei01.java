package com.xiancommon.utils.interview01;

import java.util.*;

public class Huawei01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 手中的牌
        String HandInString = in.nextLine();
        System.out.println(HandInString);
        // 已出的牌
        String HandOutString = in.nextLine();
        System.out.println(HandInString);

        System.out.println(find(HandInString,HandOutString));

    }

    public static String find(String HandInString,String HandOutString) {
        String result = "";
        // 输出对手可能的牌
        LinkedList<Integer> list01 = new LinkedList();
        LinkedList<Integer> list02 = new LinkedList();
        for (String a:HandInString.split("-")) {
            list01.add(StrToNum(a));
        }
        for (String b:HandOutString.split("-")) {
            list02.add(StrToNum(b));
        }

        if (list01.size() < 5 || list02.size() < 5) {
           return  "NO-CHAIN";
        }

        Collections.sort(list01);

        Collections.sort(list02);

        Object[] arr01 = list01.toArray();
        Object[] arr02 = list02.toArray();
        int len01 = arr01.length;
        int len02 = arr02.length;
        if (len02 > len01) {
            return  "NO-CHAIN";
        }
        int[] resultArr = new int[54];
        for (int i = 0;i < len02;i++) {
            for (int j = 0;j < len01;j++) {
                int temp01 = (int)arr02[j];
                int temp02 = (int)arr01[i];
                if (temp01 > temp02) {
                    resultArr[i] = temp01;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < resultArr.length && i < 12;i++) {
            sb.append(StrToNum(resultArr[i])).append("-");
        }

        return sb.toString();
    }

    public static int StrToNum(String str) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        map.put("A",14);
        map.put("2",15);
        map.put("B",16);
        map.put("C",17);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        map.put("6",6);
        map.put("7",7);
        map.put("8",8);
        map.put("9",9);
        map.put("10",10);
        if (map.containsKey(str)) {
            return -1;
        }
        return map.get(str);
    }

    public static String StrToNum(int num) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(11,"J");
        map.put(12,"Q");
        map.put(13,"K");
        map.put(14,"A");
        map.put(15,"2");
        map.put(16,"B");
        map.put(17,"C");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");
        map.put(6,"6");
        map.put(7,"7");
        map.put(8,"8");
        map.put(9,"9");
        map.put(10,"10");
        if (map.containsKey(num)) {
            return "";
        }
        return map.get(num);
    }
}
