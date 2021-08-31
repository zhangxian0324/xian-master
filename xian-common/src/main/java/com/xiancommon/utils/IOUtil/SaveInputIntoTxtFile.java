package com.xiancommon.utils.IOUtil;


import java.io.File;

public class SaveInputIntoTxtFile {

    private volatile SaveInputIntoTxtFile instance = null;

    private SaveInputIntoTxtFile() {

    }

    public synchronized SaveInputIntoTxtFile getInstance() {
        if (instance == null) {
            instance = new SaveInputIntoTxtFile();
        }
        return instance;
    }

    public int createFile(String path,String suffixName) {

        File file = new File(path);

        return 0;
    }

}
