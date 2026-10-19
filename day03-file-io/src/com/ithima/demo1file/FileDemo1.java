package com.ithima.demo1file;

import java.io.File;
import java.util.Arrays;

public class FileDemo1 {
    public static void main(String[] args) {
        //目标：掌握File类的常用方法
        //1.创建File对象
        File f1=new File("day03-file-io/src/com/ithima/demo1file/aaa.txt");;
        System.out.println(f1);
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(f1.length());
        System.out.println(f1.lastModified());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        File f2=new File("day03-file-io/src/com/ithima/demo1file/directory");
        File f3=new File("day03-file-io/src/com/ithima/demo1file/directory/3.txt");
        File f4=new File("day03-file-io/src/com/ithima/demo1file/directory/directory2");
        File f5=new File("day03-file-io/src/com/ithima/demo1file/directory/directory2/directory3/directory4");
        f4.mkdir();
        f2.mkdir();
        try {
            f3.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        f5.mkdirs();

        System.out.println(f2.exists());
        System.out.println(f5.exists());
        System.out.println(f2.isDirectory());
        System.out.println(Arrays.toString(f2.list()));
        File[] files=f2.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
            //System.out.println(file.getAbsolutePath());
            System.out.println(file.length());

        }
        files[2].delete();
        File[] files2=f2.listFiles();
        for (File file : files2) {
            System.out.println(file.getName());

        }
    }
}
