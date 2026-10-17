package com.itheima.demo4test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 使用Collections工具类向List中添加元素
        Collections.addAll(list,"张三","李四","王五");
        // 使用Collections工具类对List进行操作
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
