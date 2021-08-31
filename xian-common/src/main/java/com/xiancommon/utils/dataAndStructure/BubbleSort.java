package com.xiancommon.utils.dataAndStructure;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class BubbleSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.insert(5643);
        arr.insert(56423);
        arr.insert(562343);
        arr.insert(124545);
        arr.insert(52);
        arr.insert(564);
        arr.insert(53);
        arr.insert(543);
        arr.insert(53);
        arr.insert(53);
        arr.insert(53);
        arr.insert(543);
        arr.insert(543);
        arr.display();
        System.out.println("前后对比：");
        arr.selectSortImp();
        arr.display();

        // StringBuffer StringBuilder
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }
}

class ArrayBub {
   private long[] a;
   private int nElem;

   public ArrayBub(int max) {
        a = new long[max];
        nElem = 0;
   }

   public void insert(long value) {
       a[nElem] = value;
       nElem++;
   }

   public void display() {
       for (int j = 0;j < nElem;j++) {
           System.out.print(a[j] + ",");
       }
       System.out.println();
   }

    // 冒泡排序
   public void bubbleSortImp(){
       int out,in;
       for (out = nElem - 1;out > 1;out--) {
           for (in = 0;in < out;in++) {
               if (a[in] > a[in+1]) {
                   swap(in,in+1);
               }
           }
       }
   }

   // 选择排序
   public void selectSortImp() {
       int out,in,min;
       for (out = 0;out < nElem - 1;out++) {
           min = out;
           for (in = out + 1; in < nElem;in++) {
               if (a[in] < a[min]) {
                   min = in;
               }
               swap(out,min);
           }
       }
   }

   private void swap(int one,int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
   }
}
