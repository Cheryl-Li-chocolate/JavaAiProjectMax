package com.ithima.demo8fileWriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) {

        try (Writer fw = new FileWriter("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt")) {
            fw.write("Hello, World!");
            fw.write("\r\n");
            char[] chars = "Hello, World!".toCharArray();
            fw.write(chars);
            //fw.flush(); //刷新缓冲区,通知缓冲区中的数据全部写出来，但是关闭里面包含了刷新

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
