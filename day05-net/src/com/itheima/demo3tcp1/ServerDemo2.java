package com.itheima.demo3tcp1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;
import java.util.concurrent.*;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        //创建服务器对象
        System.out.println("==服务器启动==");
        ServerSocket ss=new ServerSocket(8080);
        while(true){
            Socket socket = ss.accept();
            System.out.println("客户端上线"+socket.getInetAddress().getHostAddress());
            String msg=new DataInputStream(socket.getInputStream()).readUTF();
        }
    }
}
