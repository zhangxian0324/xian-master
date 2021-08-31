package com.xiancommon.utils.jvmUtil;

public class SimpleArgs {
    public static void main(String[] args) {
        for (int i = 0;i < args.length;i++) {
            System.out.println("参数" + (i + 1) + ":" + args[0]);
        }

        System.out.println("-Xmx" + Runtime.getRuntime().maxMemory()/ 1024 / 1024 + "M");
    }
}
