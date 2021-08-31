package com.zhangxian.xianredisapp.entities;

import java.io.*;

public class Serial {
    /**
     * 序列化
     * @throws IOException
     */
    public void serial() throws IOException {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(1);
        customerEntity.setName("张贤");
        customerEntity.setAge("32");
        customerEntity.setPassword("passwd");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("cust.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customerEntity);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) oos.close();
            if (fos != null) fos.close();
        }
    }

    /**
     * 反序列化
     * @throws IOException
     */
    public void desial() throws IOException {
        CustomerEntity customerEntity;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("cust.txt");
            ois = new ObjectInputStream(fis);
            customerEntity = (CustomerEntity) ois.readObject();
            System.out.println(customerEntity.toString());
        } catch (IOException | ClassNotFoundException e1) {
            e1.printStackTrace();
        } finally {
            if (ois != null) ois.close();
            if (fis != null) fis.close();
        }

    }
    public static void main(String[] args) throws Exception {
        Serial serial = new Serial();
        serial.serial();
        serial.desial();
    }
}
