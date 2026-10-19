package com.ithima.demo10bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo1 {
    //目标：文件字符输入流
    public static void main(String[] args) {
        try (Reader fr = new FileReader("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt");

             BufferedReader br = new BufferedReader(fr);
        ) {
//            int len = 0;
//            char[] buffer = new char[1024];
//            while ((len = br.read(buffer) )!= -1) {
//                System.out.println(new String(buffer, 0, len));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }


        }

        catch(
    Exception e)

    {
        e.printStackTrace();
    }
}
}
