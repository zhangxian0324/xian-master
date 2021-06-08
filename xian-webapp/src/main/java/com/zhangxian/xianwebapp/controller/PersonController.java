package com.zhangxian.xianwebapp.controller;

import com.zhangxian.xianwebapp.pojo.Person;
import com.zhangxian.xianwebapp.servers.PersonServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PersonController {
    private Logger log = LoggerFactory.getLogger(PersonServer.class);
    @Resource
    private PersonServer service;

    @RequestMapping("/index")
    public String listPre(Model model) {
        Person preList = service.findAll();
        System.out.println("-----------:"+ preList.toString());
        log.info("===========" + preList.getName());
        model.addAttribute("person", preList);
        return "index";
    }

 }