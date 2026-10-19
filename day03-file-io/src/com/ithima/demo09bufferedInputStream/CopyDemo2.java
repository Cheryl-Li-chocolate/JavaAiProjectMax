package com.ithima.demo09bufferedInputStream;



import java.io.*;


public class CopyDemo2 {
    public static void main(String[] args) {

        myCopyFile("day03-file-io/src/com/ithima/demo5fileoutputStream/02-out.txt", "day03-file-io/src/com/ithima/demo6copy/02-out.txt");

    }

    public static void myCopyFile(String srcPath, String destPath) {
        try (InputStream is = new FileInputStream(srcPath);
             InputStream bis = new BufferedInputStream(is);
             OutputStream os = new FileOutputStream(destPath);
             OutputStream bos = new BufferedOutputStream(os);

             ) {


            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


