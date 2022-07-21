package com.xiancommon.utils.algorithm.leetcode.findMedianSortedArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangxian
 * @Dec 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 */
public class FindMedianSortedArrays {
    /**
     * 暴力算法：把两个数组先排序，在找中位数。
     * @return
     */
    public static double find(int[] nums1,int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return 0.0;
        }
        int m = nums1.length;
        int n = nums2.length;
        int tempLen = m + n;
        int[] temp = new int[tempLen];
        System.arraycopy(nums1,0,temp,0,m);
        System.arraycopy(nums2,0,temp,m,n);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        if (tempLen % 2 == 1) {
            return temp[(tempLen - 1) / 2];
        } else {
            double dd = (double) (temp[tempLen / 2 - 1] + temp[tempLen / 2]) / 2;
            return dd;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
       System.out.println(find(nums1,nums2));

        System.out.println(5 / 2);

    }
}
