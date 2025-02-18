package com.xiancommon.dataStructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Stack;

/**
 * @author zhangxian
 */
public class HeapClass {
    private final static Logger log = LoggerFactory.getLogger("HeapClass.class");
    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        stack.add("1");stack.add("2");
        stack.add("3");stack.add("4");
        /*
           pop 先弹出在删除
         */
        log.info(stack.pop());
        log.info(stack.toString());
        /*
        peek 只是弹出
         */
        log.info(stack.peek());
        log.info(stack.toString());

    }



}
