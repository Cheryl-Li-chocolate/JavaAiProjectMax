package com.itheima.demo2udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("==客户端启动==");
        //1.创建DatagramSocket对象
        DatagramSocket socket=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        while (true) {
            //2.创建数据包对象封装要发送的数据
            System.out.println("请说");
            String msg=sc.nextLine();

            if("exit".equals(msg)) {
                System.out.println("==客户端退出==");
                socket.close();
                break;
            }
            byte[] bytes=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(), 8888);
            //3.发送端对象发送数据包的数据
            socket.send(packet);
        }
    }
}
