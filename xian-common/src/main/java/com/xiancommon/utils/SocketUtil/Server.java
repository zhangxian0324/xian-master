package com.xiancommon.utils.SocketUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


public class Server {
    private final static Logger log = LoggerFactory.getLogger("Server.class");

    public static void conn() {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = new Socket();
            while (true) {
                socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                InetAddress address = socket.getInetAddress();
                log.info("当前客户端的IP：" + address.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        conn();
    }
}
