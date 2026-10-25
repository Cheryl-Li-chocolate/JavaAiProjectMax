package com.itheima.demo7;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        //创建服务器对象
        System.out.println("==服务器启动==");
        ServerSocket ss=new ServerSocket(8080);
        ExecutorService pool= new ThreadPoolExecutor(3,10,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(100), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        while(true){
            Socket socket = ss.accept();
            System.out.println("客户端上线"+socket.getInetAddress().getHostAddress());
            pool.execute(new ServerReader(socket));
        }
    }
}
