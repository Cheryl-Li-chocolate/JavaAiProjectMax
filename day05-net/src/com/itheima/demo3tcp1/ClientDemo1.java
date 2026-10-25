package com.itheima.demo3tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println( "==客户端启动==");
        Socket socket = new Socket("localhost",9999);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请说");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("退出成功");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
