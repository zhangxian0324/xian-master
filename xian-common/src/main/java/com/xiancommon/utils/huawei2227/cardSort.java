package com.xiancommon.utils.huawei2227;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class cardSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList arrayList = new ArrayList<>();
        String intputStr = in.nextLine();
        System.out.print(intputStr);
        if ("".equals(intputStr)) {
            System.out.print("No");
            return;
        }
        String[] arr = intputStr.split("");
        printSortedNum(arr);
    }

    public static String printSortedNum(String[] arr) {
        HashMap<String, String> map = new HashMap();
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "10");
        map.put("J", "11");
        map.put("Q", "12");
        map.put("K", "13");
        map.put("A", "14");
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = Integer.valueOf(map.get(arr[i]));
        }
        // 排序
        Arrays.sort(temp);
        // 排序结果输出
        int[] result_arr = new int[temp.length];
        int i = 0;
        if (temp[0] == 2) {
            i = 1;
        }
        boolean exists = false;
        for (; i < temp.length; i++) {
            for (int j = 5; j < temp.length; j++) {
                int[] temp_01 = new int[j];
                for (int k = 0; k < i + j; k++) {
                    temp_01[k] = temp[i + k];
                }
                if (judgmentSortcard(temp_01) == true) {
                    exists = true;
                    System.out.print(Arrays.toString(temp_01));
                }
            }
        }
        if (!exists) {
            System.out.print("No");
        }
        return null;
    }

    public static boolean judgmentSortcard(int[] sortedArr) {
        for (int i = 0;i < sortedArr.length - 1 ;i++) {
            if (sortedArr[i] + 1 == sortedArr[i++]) {
                return true;
            }
        }
        return false;
    }
}
