package com.xiancommon.utils.StringUtil;

import java.util.Properties;

public class sysUtil {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
