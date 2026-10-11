package com.itheima.demo4genericity;

import com.itheima.demo3genericity.Student;
import com.itheima.demo3genericity.StudentData;

public class GenericDemo4 {
    public static void main(String[] args) {
        String[] names={"张三","李四","王五"};
        String max = getMax(names);
        Student[] students={new Student(),new Student()};
        Student maxstudent = getMax(students);

    }
    public static <T> T getMax(T[] t){
        return t[0];
    }
}
