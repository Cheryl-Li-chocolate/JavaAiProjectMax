package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println(set);

        Set<Student> set2=new HashSet<>();
        set2.add(new Student("张三",18,"男"));
        set2.add(new Student("李四",19,"女"));
        set2.add(new Student("张三",18,"男"));
        System.out.println(set2);

        Set<String> set3=new LinkedHashSet<>();
        set3.add("张三");
        set3.add("李四");
        set3.add("张三");
        System.out.println(set3);

    }
}

