package com.xiancommon.utils.jvmUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangxian
 */
public class JavaVMStackSOF {
    private final static Logger log = LoggerFactory.getLogger("JavaVMStackSOF.class");

    private int stackLength = 1;
    public void stackLeak() {
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Throwable e) {
            log.info("stack length :" + javaVMStackSOF.stackLength);
            throw e;
        }

    }
}
