package com.itheima.demo4test;

import java.util.Arrays;

public class ParamDemo1 {
    public static void main(String[] args) {
        // 可变参数
        print(2,"张三", "李四", "王五");
    }

    public static void print(int age,String... names) {
        System.out.println(age);
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));
    }
}
