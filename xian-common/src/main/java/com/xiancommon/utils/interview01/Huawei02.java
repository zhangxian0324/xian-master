package com.xiancommon.utils.interview01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Huawei02 {
    private final static Logger log = LoggerFactory.getLogger("Huawei02.class");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line01 = in.nextLine();
        String line02 = in.nextLine();
        String line03 = in.nextLine();
        String line04 = in.nextLine();
        log.info(line01);
        log.info(line02);
        log.info(line03);
        log.info(line04);
        String[] arr01 = line01.split(" ");
        String[] arr02 = line02.split(" ");
        String[] arr03 = line03.split(" ");
        String[] arr04 = line04.split(" ");
        // 相交的宽度
        int windth = Math.min(Integer.valueOf(arr01[0]),Integer.valueOf(arr02[0]));
        int heigth = Math.min(Integer.valueOf(arr03[3]),Integer.valueOf(arr04[4]));
        // 相交的长度
        int result = 0;
        if (windth < 0 || heigth < 0)  {
            result = 0;
        }
        result= windth * heigth;
        log.info(result + "");


    }
}
