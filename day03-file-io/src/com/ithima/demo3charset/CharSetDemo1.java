package com.ithima.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String names="你我他666";
        byte[] bytes=names.getBytes();
        System.out.println(bytes.length);
        byte[] bytes1=names.getBytes("GBK");
        System.out.println(bytes1.length);

        String str=new String(bytes1,"GBK");
        String str1=new String(bytes);
        String str2=new String(bytes,"GBK");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);










    }
}
