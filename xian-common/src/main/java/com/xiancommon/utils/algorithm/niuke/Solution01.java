package com.xiancommon.utils.algorithm.niuke;

import java.util.List;

/**
 * 将一个节点数为 size 链表 m 位置到 n 位置之间的区间反转，要求时间复杂度 O (n ) O(n)，空间复杂度 O (1 ) O(1)。
 */

public class Solution01 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // 初始化node
        ListNode initNode = new ListNode(-1);
        initNode.next = head;
        ListNode pre = initNode;
        // 找到第M个node
        for (int i = 0; i < m - 1 ;i++) {
            pre = pre.next;
        }
        ListNode curr = pre.next;
        ListNode nextNode;
       for (int j = 0;j < n - m ;j++) {
           nextNode = curr.next;
           curr.next = nextNode.next;
           nextNode.next = pre.next;
           pre.next = nextNode;
       }
       return initNode.next;

    }
}