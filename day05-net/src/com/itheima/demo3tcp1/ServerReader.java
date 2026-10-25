package com.itheima.demo3tcp1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread {
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
    try {
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        while (true) {
            String msg = dis.readUTF();

            System.out.println("收到客户端数据：" + msg);
            System.out.println("客户端的IP地址：" + socket.getInetAddress().getHostAddress());
            System.out.println("客户端的端口号：" + socket.getPort());
        }


        } catch (Exception e) {
        System.out.println("客户端下线");
    }
}}
