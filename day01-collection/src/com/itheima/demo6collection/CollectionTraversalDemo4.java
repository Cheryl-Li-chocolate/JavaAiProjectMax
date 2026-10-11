package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTraversalDemo4 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式一：Lambda表达式遍历
        Collection<String> names=new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        System.out.println(names);

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }

//        names.forEach(s->System.out.println(s));
        names.forEach(System.out::println);




}


}