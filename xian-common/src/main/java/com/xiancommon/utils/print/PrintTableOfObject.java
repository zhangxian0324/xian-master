package com.xiancommon.utils.print;

import org.openjdk.jol.info.ClassLayout;

import java.net.URL;

public class PrintTableOfObject {
    public static void main(String[] args) {
        char c = '5';
        char c1 = 3;
        System.out.println(c == c1);
        boolean isDigit = Character.isDigit(c); // true
        System.out.println(isDigit);
        Object o = new Object();
        System.out.print(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o) {
            System.out.print(ClassLayout.parseInstance(o).toPrintable());
        }
        URLInit();
    }

    public static void URLInit() {
        try {
            URL base = PrintTableOfObject.class.getResource(".");
            URL baseUrl = new URL("http://www.example.com");
            URL url = new URL(base, "path/to/resource");
            System.out.println("URL: " + url.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
