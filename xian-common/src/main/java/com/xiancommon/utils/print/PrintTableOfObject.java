package com.xiancommon.utils.print;

import org.openjdk.jol.info.ClassLayout;

public class PrintTableOfObject {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.print(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o) {
            System.out.print(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
