package com.zhangxian.xianredisapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisControllerTest {
    @Autowired
    private RedisController redisController;

    @Test
    void redisset() {
        redisController.redisset("1","1");
    }

    @Test
    void redisget() {
    }

    @Test
    void expire() {
    }
}