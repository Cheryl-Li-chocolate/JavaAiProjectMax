package com.ithima.demo13printStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo3 {
    public static void main(String[] args) {
        try (DataInputStream dos = new DataInputStream(new FileInputStream("day03-file-io/src/com/ithima/demo13printStream/2-out.txt"))) {
            System.out.println(dos.readUTF());
            System.out.println(dos.readInt());
            System.out.println(dos.readDouble());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
