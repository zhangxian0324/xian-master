package com.xiancommon.utils.StringUtil;

import java.util.Properties;

public class sysUtil {
    static O newObject = null;
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
        final int  a = 10;
        newObject = new O();
        newObject.setA(1);
        newObject = new O();
        newObject.setA(2);
        newObject = new O();
        newObject.setA(3);
        newObject = new O();
        newObject.setA(4);
        newObject = new O();
        newObject.setA(5);
        System.out.println(newObject.getA());
    }

    static class O {
        private int a = 1;
        public O() {

        }
        public O(int a) {

        }
        public void setA(int a) {
            this.a = a;
        }
        public int getA() {
            return a;
        }

        
    }
}
