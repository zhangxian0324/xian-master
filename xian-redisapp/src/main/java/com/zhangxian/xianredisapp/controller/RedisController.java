package com.zhangxian.xianredisapp.controller;

import com.zhangxian.xianredisapp.entities.CustomerEntity;
import com.zhangxian.xianredisapp.utils.redisUtils.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/redis")
@RestController
public class RedisController {
    private static int ExpireTime = 60;   // redis中存储的过期时间60s
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisset(String key, String value) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(1);
        customerEntity.setName("zhangsan");
        customerEntity.setAge(String.valueOf(20));
        return redisUtil.set(String.valueOf(customerEntity.getId()), customerEntity.toString());
    }

    @RequestMapping("get")
    public Object redisget(String key) {
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key) {
        return redisUtil.expire(key, ExpireTime);
    }
    

}
