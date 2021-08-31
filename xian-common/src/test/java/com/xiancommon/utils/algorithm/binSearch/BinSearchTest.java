package com.xiancommon.utils.algorithm.binSearch;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class BinSearchTest {
    private Logger logger = LoggerFactory.getLogger(BinSearchTest.class);
    @Test
    public void find() {
        BinSearch binSearch = new BinSearch();
        int[] arr = {1,2,3,4,5,6,7,80};
        int result = binSearch.find(arr,80);
        assertEquals(8,result);
    }

}