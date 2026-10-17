package com.itheima.demo2Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTraverseDemo4 {
    public static void main(String[] args) {
        // Map集合的遍历方式三：Lambda表达式遍历
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",18);
        map.put("李四",20);
        map.put("王五",22);
        map.put("赵六",24);
        System.out.println(map);

        //调用Map集合的forEach方法

        map.forEach(new BiConsumer<String,Integer>(){
            @Override
            public void accept(String name,Integer age){
                System.out.println(name+"="+age);
            }
        });

    }
}