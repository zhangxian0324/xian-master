package com.xiancommon.utils.StringUtil;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @org.junit.jupiter.api.Test
    void getRandom() {
        int result = StringUtil.getRandom();
        assertTrue(result >= 0 && result < 100000);
    }
}
