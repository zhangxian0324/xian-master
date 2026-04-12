package com.xiancommon.utils.DateUtil;

import static org.junit.jupiter.api.Assertions.*;

class DateFomartTest {

    @org.junit.jupiter.api.Test
    void time0Format() {
        String date = "123045";
        String parseType = "HHmmss";
        String targetType = "HH:mm:ss";
        String result = DateFomart.time0Format(date, parseType, targetType);
        assertEquals("12:30:45", result);
    }

    @org.junit.jupiter.api.Test
    void time0FormatWithDate() {
        String date = "20230401";
        String parseType = "yyyyMMdd";
        String targetType = "yyyy-MM-dd";
        String result = DateFomart.time0Format(date, parseType, targetType);
        assertEquals("2023-04-01", result);
    }

    @org.junit.jupiter.api.Test
    void time0FormatWithNull() {
        String result = DateFomart.time0Format(null, "HHmmss", "HH:mm:ss");
        assertEquals("", result);
    }

    @org.junit.jupiter.api.Test
    void time0FormatWithEmpty() {
        String result = DateFomart.time0Format("", "HHmmss", "HH:mm:ss");
        assertEquals("", result);
    }

    @org.junit.jupiter.api.Test
    void time0FormatWithInvalid() {
        String result = DateFomart.time0Format("invalid", "HHmmss", "HH:mm:ss");
        assertEquals("", result);
    }
}