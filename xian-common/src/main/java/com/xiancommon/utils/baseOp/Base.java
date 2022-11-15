package com.xiancommon.utils.baseOp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Base {
    private final static Logger log = LoggerFactory.getLogger("Base.class");

    //
    public static void print() {
        //
        String a = new String("sdfsdfsd");
        String a_1 = "3fdfd";
        char ch = 'a';
        for (char cha : a_1.toCharArray()) {
            log.info("" + cha);
        }
    }
    //
    public static void main(String[] args) {
        print();
    }


}
