package com.ithima.demo11bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest2 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        try (
                BufferedReader br = new BufferedReader(new FileReader("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("day03-file-io/src/com/ithima/demo8fileWriter/0-out.txt"));
        ) {
            List<String> content=new ArrayList<>();
            String line;
            while((line=br.readLine())!=null){
                content.add(line);
            }
            Collections.sort(content,(o1,o2)->o1.compareTo(o2));
            for(String str:content){
                bw.write(str);
                bw.newLine();
            }
            System.out.println("排序完成");
            long end=System.currentTimeMillis();
            System.out.println("耗时："+(end-start)/1000+"s");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
