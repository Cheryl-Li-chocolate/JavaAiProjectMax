package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式一：增强for遍历
        Collection<String> names=new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        System.out.println(names);

        for(String name:names){
            System.out.println(name);


        }

    }
}