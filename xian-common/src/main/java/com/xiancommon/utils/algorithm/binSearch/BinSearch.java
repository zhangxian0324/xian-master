package com.xiancommon.utils.algorithm.binSearch;

/**
 * 排序后才能二分查找
 * @author zhangxian
 */
public class BinSearch {
    public int find(int[] arr,int target) {
        if (arr == null) {
            return -1;
        }
        int lo = 0,mid,len = arr.length;
        while (lo <= len) {
            mid = (lo + len) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                len = mid - 1;
            }
        }
        return 0;
    }
}
