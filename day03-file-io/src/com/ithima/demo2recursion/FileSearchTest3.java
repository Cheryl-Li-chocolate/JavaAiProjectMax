package com.ithima.demo2recursion;

import java.io.File;
import java.io.IOException;

public class FileSearchTest3 {
    public static void main(String[] args) {
        File dir=new File("D:");
        String fileName="QQ.exe";
        try {
            searchFile(dir,fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void searchFile(File dir, String fileName) throws IOException {
        if(dir==null||dir.exists()==false||dir.isFile()==true)
            return;
        File[] files=dir.listFiles();
        if(files!=null && files.length>0){
            for(File file:files){
                if(file.isFile()){
                    if(file.getName().contains(fileName)){
                        System.out.println("文件找到了");
                        Runtime r=Runtime.getRuntime();
                        r.exec(file.getAbsolutePath());
                    }
                    else{
                        searchFile(file,fileName);
                    }
                }
            }
        }
    }
}
