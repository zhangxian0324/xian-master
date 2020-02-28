package com.zhangxian.xianwebapp.controller;

import com.zhangxian.xianwebapp.mapper.PersonMapper;
import com.zhangxian.xianwebapp.pojo.Person;
import com.zhangxian.xianwebapp.servers.PersonServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PersonController {
    @Resource
    private PersonServer service;

    @RequestMapping("/index")
    public String listPre(Model model) {
        Person preList = service.findAll();
        System.out.println("===========" + preList.getName());
        model.addAttribute("person", preList);
        return "index";
    }
}