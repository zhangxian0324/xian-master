package com.xiancommon.utils;

import static org.junit.jupiter.api.Assertions.*;

class jxUtilTest {

    @org.junit.jupiter.api.Test
    void countSeq() {
        jxUtil util = new jxUtil();
        int result = util.countSeq("ccbft");
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void countSeqWithMultiple() {
        jxUtil util = new jxUtil();
        int result = util.countSeq("ccbftccbft");
        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test
    void countSeqWithShortString() {
        jxUtil util = new jxUtil();
        int result = util.countSeq("abc");
        assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void countSeqWithNull() {
        jxUtil util = new jxUtil();
        int result = util.countSeq(null);
        assertEquals(0, result);
    }
}
