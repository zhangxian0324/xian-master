package com.xiancommon.utils.jvmUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleHeap {
    private final static Logger log = LoggerFactory.getLogger("SimpleHeap.class");

    private int id;
    public SimpleHeap(int id) {
        this.id = id;
    }
    public void show() {
        log.info("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
