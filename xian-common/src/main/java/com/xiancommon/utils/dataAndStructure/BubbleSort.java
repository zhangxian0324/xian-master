package com.xiancommon.utils.dataAndStructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangxian
 */
public class BubbleSort {
    private final static Logger log = LoggerFactory.getLogger("BubbleSort.class");

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
        log.info("前后对比：");
        arr.selectSortImp();
        arr.display();

        // StringBuffer StringBuilder
        StringBuilder stringBuffer = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
    }
}

class ArrayBub {
   private final long[] arr;
   private int nElem;

   public ArrayBub(int max) {
       arr = new long[max];
        nElem = 0;
   }

   public void insert(long value) {
       arr[nElem] = value;
       nElem++;
   }

   public void display() {
       for (int j = 0;j < nElem;j++) {
           System.out.print(arr[j] + ",");
       }
       System.out.println();
   }

    // 冒泡排序
   public void bubbleSortImp(){
       int out,in;
       for (out = nElem - 1;out > 1;out--) {
           for (in = 0;in < out;in++) {
               if (arr[in] > arr[in+1]) {
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
               if (arr[in] < arr[min]) {
                   min = in;
               }
               swap(out,min);
           }
       }
   }

   private void swap(int one,int two) {
        long temp = arr[one];
       arr[one] = arr[two];
       arr[two] = temp;
   }
}
