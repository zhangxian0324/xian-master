package com.zhangxian.xianwebapp.servers.impl;

import com.zhangxian.xianwebapp.mapper.PersonMapper;
import com.zhangxian.xianwebapp.pojo.Person;
import com.zhangxian.xianwebapp.servers.PersonServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonServer {
    private PersonMapper personMapper;

    @Override
    public Person findAll() {
        return personMapper.findAll();
    }
}
