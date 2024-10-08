package com.xiancommon.utils.SocketUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.Socket;

/**
 * @author zhangxian
 */
public class ServerThread extends Thread {
    private final static Logger log = LoggerFactory.getLogger("ServerThread.class");

    private Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            is = socket.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {
                log.info("我是服务端，客户端说：" + info);
            }
            socket.shutdownInput();
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("服务器欢迎你");
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (pw != null) {
                pw.close();
            }
            if (os != null) {
                os.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
