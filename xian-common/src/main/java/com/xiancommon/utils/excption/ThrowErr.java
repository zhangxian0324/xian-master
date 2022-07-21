package com.xiancommon.utils.excption;

public class ThrowErr {
    public void thr(){
        int a = 1,b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            e.printStackTrace();
            new NullPointerException();
        }
    }

    public static void main(String[] args) {
        ThrowErr err = new ThrowErr();
        err.thr();

    }
}
