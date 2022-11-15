package com.xiancommon.utils.ClassLoadUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangxian
 */
public class ClassLoadUtil {
    private final static Logger log = LoggerFactory.getLogger("CalUtil.class");

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        /**
         * forName
         */
        Class<?> cloud = Class.forName("com.xiancommon.utils.ClassLoadUtil.Cloud");
        /**
         * .class
         */
        Class<Cloud> cloud1 = Cloud.class;
        /**
         * .concustuctor
         *
         */
        Constructor<Cloud> cloud2 = Cloud.class.getConstructor();
        Cloud cloud3 = cloud2.newInstance();

        /**
         * clone :浅拷贝和深拷贝
         */
        Cloud cloud4 = cloud3.clone();

        /**
         * 序列化和反序列化
         */
        serial();
        Cloud cloud5 = unSerial();
        log.info(cloud5.print())  ;

    }

    public static void serial() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("aa.txt"));
        Cloud a = new Cloud();
        a.setId(1);
        a.setName("1");
        objectOutputStream.writeObject(a);
        objectOutputStream.close();
    }

    public static Cloud unSerial() throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("aa.txt"));
        Cloud obj = (Cloud) input.readObject();
        return obj;
    }


}
