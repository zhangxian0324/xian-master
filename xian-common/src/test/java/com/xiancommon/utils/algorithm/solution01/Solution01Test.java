package com.xiancommon.utils.algorithm.solution01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Solution01Test {
    private static Logger log = LoggerFactory.getLogger(Solution01Test.class);
    Solution01 solution = null;

    @BeforeAll
      void before11() {
        log.info("111111111111111111","");
        solution = new Solution01();
    }
    @Test
     void test() {
        int n = 1;
        assertEquals(1,
                solution.solution(n));
    }
    @AfterAll
     void last11() {
        log.info("最后加载3333333333333333333333","");
    }

}