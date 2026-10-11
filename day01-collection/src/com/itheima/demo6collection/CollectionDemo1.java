package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo1 {
    //目标：理解Collection提供的通用集合功能
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("abc");
        System.out.println(c.size());
        System.out.println(c.contains("abc"));
        System.out.println(c.remove("abc"));
        System.out.println(c.isEmpty());
        System.out.println(c);
        c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c);
        //把集合转换成数组
        c.add("abc");
        c.add("def");
        c.add("abc");
        Object[] arr = c.toArray();//默认转Object类型的数组
        System.out.println(Arrays.toString(arr));

    }
}
