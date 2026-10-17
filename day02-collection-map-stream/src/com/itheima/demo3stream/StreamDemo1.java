package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        //目标：认识Stream流的概念和作用
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("张飞");
        list.add("张三丰");

        List<String> newList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 2)
                newList.add(name);
        }
        System.out.println(newList);

        List<String> newList2=list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==2).collect(Collectors.toList());

        System.out.println(newList2);

    }
}
