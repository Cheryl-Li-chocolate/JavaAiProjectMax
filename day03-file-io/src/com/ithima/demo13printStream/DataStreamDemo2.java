package com.ithima.demo13printStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo2 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io/src/com/ithima/demo13printStream/2-out.txt"))) {
            dos.writeUTF("Hello, World!");
            dos.writeInt(123);
            dos.writeDouble(3.14);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
