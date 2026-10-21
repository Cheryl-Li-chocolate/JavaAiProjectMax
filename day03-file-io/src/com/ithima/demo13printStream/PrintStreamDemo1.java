package com.ithima.demo13printStream;

import java.io.*;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try (
                //PrintStream ps = new PrintStream("day03-file-io/src/com/ithima/demo12inputStreamReader/1-out.txt");
                //PrintWriter pw = new PrintWriter("day03-file-io/src/com/ithima/demo13printStream/1-out.txt");
                Writer bw = new FileWriter("day03-file-io/src/com/ithima/demo13printStream/1-out.txt",true);
                PrintWriter pw= new PrintWriter(bw);
        ) {
            pw.println("Hello, World!");
            pw.println("Java");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
