package com.xiancommon.utils.algorithm.sort;

import java.io.FileInputStream;
import java.util.Scanner;

public class InsertSort {
    /**
     * 插入排序:
     *   1、先从第一个开始，第一个已经排序好。
     *   2、取出第二个数组和第一个比较，如果第一个数字大于第二个数字，则交换位置，否则不做动作。
     *
     */
    public void sort(int[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0;i < arr.length - 1;i++) {
            if (arr[i] > arr[i+1]) {
                
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("" + (endTime - startTime) / 1000 + "s");

    }


    public static void swap(int a,int b) {
        System.out.println("a = " + a + ";b = " + b);
        a = a ^ b;
        System.out.println("a = " + a + ";b = " + b);
        b = b ^ a;
        System.out.println("a = " + a + ";b = " + b);
        a = a ^ b;
        System.out.println("a = " + a + ";b = " + b);
    }

    public static void main(String[] args) {
        swap(1,Integer.MAX_VALUE);
    }
    /**
     * 从控制台输入，存在数组里
     */
    public void input(Scanner scanner) {

    }

    /**
     * 从文件里读，存在数组里
     */
    public void input(FileInputStream FileInputStream) {

    }




    public void print() {

    }


}
