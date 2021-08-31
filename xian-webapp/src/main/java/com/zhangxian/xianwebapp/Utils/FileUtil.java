package com.zhangxian.xianwebapp.Utils;

public class FileUtil {

    private volatile static FileUtil instance = null;

    private FileUtil() {

    }

    public static synchronized FileUtil getInstance() {
        if (instance == null) {
            synchronized (FileUtil.class) {
                instance = new FileUtil();
            }
        }
        return instance;
    }
    
    public String getName(String string) {
        if (string == null || "".equals(string))
            return "";
        return string;
    }

    public static void main(String[] args) {
        FileUtil fileUtil = FileUtil.getInstance();
        fileUtil.getName("343242");
    }


}
