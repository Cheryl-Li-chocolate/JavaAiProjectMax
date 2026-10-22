package com.itheima.demo1inetaddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        try {
            InetAddress ip1=InetAddress.getLocalHost();
            System.out.println(ip1);
            System.out.println(ip1.getHostAddress());
            System.out.println(ip1.getHostName());

            InetAddress ip2=InetAddress.getByName("www.baidu.com");
            System.out.println(ip2.getHostAddress());
            System.out.println(ip2.getHostName());

            System.out.println(ip2.isReachable(5000));
            InetAddress ip3=InetAddress.getByName("www.qq.com");
            System.out.println(ip3.getHostAddress());
            System.out.println(ip3.getHostName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
