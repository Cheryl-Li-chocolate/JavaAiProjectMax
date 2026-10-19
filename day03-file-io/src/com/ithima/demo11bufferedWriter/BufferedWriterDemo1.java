package com.ithima.demo11bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo1 {
    public static void main(String[] args) {

        try (Writer fw = new FileWriter("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt");
             BufferedWriter bw = new BufferedWriter(fw);

        ) {
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
