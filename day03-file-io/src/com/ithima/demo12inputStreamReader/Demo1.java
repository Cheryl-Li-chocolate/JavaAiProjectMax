package com.ithima.demo12inputStreamReader;


import java.io.*;

public class Demo1 {
    //目标：文件字符输入流
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt");
                Reader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
        ) {
//            int len = 0;
//            char[] buffer = new char[1024];
//            while ((len = br.read(buffer) )!= -1) {
//                System.out.println(new String(buffer, 0, len));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}
