package com.itheima.demo3stream;

import com.itheima.demo1hashset.Teacher;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Teacher> teachers =new ArrayList<>();
        teachers.add(new Teacher("张三",18,9999.99));
        teachers.add(new Teacher("李四",28,8888.88));
        teachers.add(new Teacher("王五",38,7777.77));
        teachers.add(new Teacher("赵六",48,6666.66));
        teachers.add(new Teacher("张三",18,9999.99));
        teachers.add(new Teacher("张三",18,9999.99));

        teachers.stream().filter(t->t.getSalary()>8000).forEach(System.out::println);
        long count=teachers.stream().filter(t->t.getSalary()>8000).count();
        System.out.println("工资大于8000的老师有："+count+"位");
        Optional<Teacher> maxTeacher=teachers.stream().max((t2, t1)->Double.compare(t2.getSalary(),t1.getSalary()));
        System.out.println("工资最高的老师是："+maxTeacher.get());
//        Optional<Teacher> minTeacher=teachers.stream().min((t1, t2)->Double.compare(t2.getSalary(),t1.getSalary()));
//        System.out.println("工资最低的老师是："+minTeacher.get());
        System.out.println("把Stream流收集起来");
        List<Teacher> teacherList=teachers.stream().collect(Collectors.toList());
        System.out.println(teacherList);

        //Set<Teacher> teacherSet=teachers.stream().collect(Collectors.toSet());
        Set<Teacher> teacherSet=new HashSet<>();
        teacherSet.addAll(teacherList);
        System.out.println(teacherSet);

        Map<String,Integer> teacherMap=teachers.stream().distinct().collect(Collectors.toMap(Teacher::getName,Teacher::getAge));
        System.out.println(teacherMap);

        Stream<Teacher> teacherStream=teachers.stream();
        Object[] teacherArray=teacherStream.toArray();
        //Arrays是一个工具类，里面有很多操作数组的方法
        System.out.println(Arrays.toString(teacherArray));




    }
}
