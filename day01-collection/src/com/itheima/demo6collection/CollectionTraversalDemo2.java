package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo2 {
    public static void main(String[] args) {
        //目标：掌握Collection的便利方式一：迭代器遍历
        Collection<String> names=new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        System.out.println(names);

        //1.获取迭代器对象
        Iterator<String> it=names.iterator();
        while(it.hasNext()){
            String name=it.next();
            System.out.println(name);

        }

    }
}