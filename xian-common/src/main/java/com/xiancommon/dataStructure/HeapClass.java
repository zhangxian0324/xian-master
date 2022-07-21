package com.xiancommon.dataStructure;

import java.util.Stack;

/**
 * @author zhangxian
 */
public class HeapClass {
    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        /**
         *  pop 先弹出在删除
         */
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        /**
         *  pop 只
         */
        System.out.println(stack.peek());

        System.out.println(stack.toString());



    }


}
