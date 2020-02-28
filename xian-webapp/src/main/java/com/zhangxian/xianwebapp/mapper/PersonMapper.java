package com.zhangxian.xianwebapp.mapper;

import com.zhangxian.xianwebapp.pojo.Person;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface PersonMapper {
   public Person findAll();
}
