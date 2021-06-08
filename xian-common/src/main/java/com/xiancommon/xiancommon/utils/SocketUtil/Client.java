package com.xiancommon.xiancommon.utils.SocketUtil;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void sendMessage() {
        try {
            Socket socket = new Socket("localhost",8088);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("客户端发送信息");
            pw.flush();
            socket.shutdownOutput();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info;
            while ((info = br.readLine()) != null) {
                System.out.println("我是客户端，服务返回信息: " + info);
            }
            br.close();
            is.close();
            os.close();
            pw.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        sendMessage();
    }
}
