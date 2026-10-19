package com.ithima.demo4fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("day03-file-io/src/com/ithima/demo4fileinputStream/01.txt");

        byte[] bytes = new byte[3];
        int len;
//        while ((len=is.read(bytes)) != -1) {
//            String str=new String(bytes,0,len);
//            System.out.print(str);
//        }

        String str1 = new String(is.readAllBytes());
        System.out.println(str1);
        is.close();
    }
}
