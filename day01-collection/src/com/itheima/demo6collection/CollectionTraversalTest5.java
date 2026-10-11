package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalTest5 {
    public static void main(String[] args) {
        //目标：并发修改异常问题
        ArrayList<String> list = new ArrayList<>();
        list.add("枸杞");
        list.add("枸杞子");
        list.add("菊花");
        list.add("红枣");
        list.add("黑枸杞");

        Iterator<String> it=list.iterator();
        while (it.hasNext()) {
            String name=it.next();
            if(name.contains("枸杞")){
                //list.remove(name);//并发修改异常 ConcurrentModificationException
                it.remove();//  用   迭代器自己的方法解决
            }

        }

//        for(String s:list){
//            if(s.contains("枸杞")){
//                list.remove(s);//并发修改异常 ConcurrentModificationException
//                //底层基于迭代器但是又拿不到迭代器
//            }
//        }

//        list.forEach(System.out::println);//并发修改异常 ConcurrentModificationException


        System.out.println(list);
    }
}