package com.xiancommon.utils.algorithm.valid;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTest {
    Valid validClass = new Valid();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void valid() {
        validClass.valid("");
        validClass.valid("{}{}");
        validClass.valid("[]");
        validClass.valid("{}{}{}{}[][][][]");
        validClass.valid("{()()()()()}");

    }
}