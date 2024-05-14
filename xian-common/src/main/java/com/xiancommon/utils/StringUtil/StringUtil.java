package com.xiancommon.utils.StringUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringUtil {
        private final static Logger log = LoggerFactory.getLogger("StringUtil.class");
    public static void main(String[] args) {
     /* String a = "23o4u23osdfndsklnfks";
      char[] arr = a.toCharArray();
      for (int i = 0; i < arr.length;i++) {
          log.info(i + "_" + arr[i]);
      }
*/
       SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       SimpleDateFormat simpleDateFormat1 =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
       Date date = new Date();
       System.out.println(simpleDateFormat.format(date));
       System.out.println(simpleDateFormat1.format(date));
    }
}
