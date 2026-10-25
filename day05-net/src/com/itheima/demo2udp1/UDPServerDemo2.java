package com.itheima.demo2udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("==服务器启动==");
        //1.创建接受端对象、注册端口
        DatagramSocket socket=new DatagramSocket(8888);
        byte[] buf=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        while (true) {
            socket.receive(packet);
            int len = packet.getLength();
            String data = new String(buf,0,len);
            System.out.println("服务端收到了："+data);
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("对方的IP地址是："+ip+"端口号是："+port);

        }
    }
}
