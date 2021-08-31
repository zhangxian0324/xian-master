package com.xiancommon.utils.StringUtil;

public class StringUtil {
    public static void main(String[] args) {
      String a = "23o4u23osdfndsklnfks";
      char[] arr = a.toCharArray();
      for (int i = 0; i < arr.length;i++) {
          System.out.println(i + "_" + arr[i]);
      }
    }
}
