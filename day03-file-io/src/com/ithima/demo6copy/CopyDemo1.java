package com.ithima.demo6copy;


import java.io.*;


public class CopyDemo1 {
    public static void main(String[] args) {

        myCopyFile("day03-file-io/src/com/ithima/demo5fileoutputStream/02-out.txt", "day03-file-io/src/com/ithima/demo6copy/02-out.txt");

    }

    public static void myCopyFile(String srcPath, String destPath){

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(srcPath);
            os = new FileOutputStream(destPath);

            byte[] buffer = new byte[1024];
            int len = 0;
            while((len=is.read(buffer))!=-1)

        {
            os.write(buffer, 0, len);
        }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(os!=null)
                    os.close();
                if(is!=null)
                    is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
