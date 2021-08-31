package com.xiancommon.utils.ClassLoadUtil;

import java.io.*;

/**
 * @author zhangxian
 */
public class Cloud implements Serializable,Cloneable {
    private static final long serialVersionUID = 7411889035386524813L;
    private int id;

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

    private String name;
    public String print() {
        return this.id + ":" + this.name;
    }

    @Override
    public Cloud clone() {
        try {
            // save the object to a byte array
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(this);
            out.close();

            // read a clone of the object from the byte array
            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            Object ret = in.readObject();
            in.close();
            out.close();
            return (Cloud) ret;
        }
        catch(Exception e) {
            return null;
        }

    }
}
