package com.zhangxian.xianwebapp.entry;

import com.zhangxian.xianwebapp.Utils.GenericClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Teacher {
    private static Logger logger = LoggerFactory.getLogger(Teacher.class);
    static {
        logger.info("Teacher==============1");
    }
    private int id;
    private String name;
    private String sex;
    public Teacher() {
        logger.info("SHTeacher构造器");
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
