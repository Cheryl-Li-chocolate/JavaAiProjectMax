package com.ithima.demo7fileReader;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    //目标：文件字符输入流
    public static void main(String[] args) {
        try (Reader fr = new FileReader("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt")) {
            int len = 0;
            char[] buffer = new char[1024];
            while ((len = fr.read(buffer) )!= -1) {
                System.out.println(new String(buffer, 0, len));

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
