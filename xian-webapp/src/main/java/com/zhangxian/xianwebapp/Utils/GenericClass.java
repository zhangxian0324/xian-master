package com.zhangxian.xianwebapp.Utils;

import com.zhangxian.xianwebapp.entry.SHTeacher;
import com.zhangxian.xianwebapp.entry.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
/**
 *
 *
 * 1、频繁往外读取内容的，适合用上界Extends。
 * 2、经常往里插入的，适合用下界Super。
 *
 * */
public class GenericClass {
    private static Logger logger = LoggerFactory.getLogger(GenericClass.class);

    public static void main(String[] args) {
        List<? super Teacher> list = new ArrayList<>();
        SHTeacher t1 = new SHTeacher();
        t1.setId(1);
        t1.setName("jack");
        t1.setSex("1");
        list.add(t1);

        Teacher t2 = new Teacher();
        t2.setId(2);
        t2.setName("mark");
        t2.setSex("2");
        list.add(t2);

        Iterator iterator = list.iterator();
        for (Iterator it = iterator; it.hasNext(); ) {
            Teacher t = (Teacher) it.next();
            logger.info(t.toString());
        }
    }


}


