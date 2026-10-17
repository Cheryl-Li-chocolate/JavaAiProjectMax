package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //目标：认识Stream流的概念和作用
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("张飞");
        list.add("张三丰");
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==2).forEach(System.out::println);

        List<Double> list2 = new ArrayList<>();
        list2.add(10.1);
        list2.add(20.2);
        list2.add(30.3);
        list2.add(40.4);
        list2.add(20.2);
        list2.stream().sorted().forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        list2.stream().sorted((d1,d2)->Double.compare(d2,d1)).forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        list2.stream().sorted().limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        list2.stream().sorted().skip(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        //如果希望自定义对象能够去重复，重写对象的hashCode和equals方法，才可以去重复！
        list2.stream().sorted().distinct().forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        list2.stream().sorted().map(s->"乘2后："+s*2).forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        Stream<String> s1=Stream.of("张三","李四","王五");
        Stream<Integer> s2=Stream.of(1,2,3,4,5);
        Stream<Object> s3=Stream.concat(s1,s2);
        s3.forEach(System.out::println);
        System.out.println("-------------------------------------------------");

    }
}
