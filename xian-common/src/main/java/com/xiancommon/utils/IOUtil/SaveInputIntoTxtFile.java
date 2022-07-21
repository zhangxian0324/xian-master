package com.xiancommon.utils.IOUtil;


import java.io.File;

/**
 * @author zhangxian
 */
public class SaveInputIntoTxtFile {
    private volatile SaveInputIntoTxtFile instance = null;
    private SaveInputIntoTxtFile() {}

    public synchronized SaveInputIntoTxtFile getInstance() {
        if (instance == null) {
            synchronized(this) {
                instance = new SaveInputIntoTxtFile();
            }
        }
        return instance;
    }

    public int createFile(String path,String suffixName) {

        File file = new File(path);

        return 0;
    }

    public static void main(String[] args) {
        SaveInputIntoTxtFile saveInputIntoTxtFile = new SaveInputIntoTxtFile().getInstance();
        saveInputIntoTxtFile.createFile("D:\\test\\intput.txt","txt");
    }

}

