package com.itheima.demo2Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("李四", 20);
        System.out.println(map.put("王五", 20));
        System.out.println(map.put("李四", 22));
        System.out.println(map);

        //写代码演示常用方法
        System.out.println(map.get("张三"));
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(20));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove("张三"));
        System.out.println(map);

        Set<String> keys= map.keySet();
        for (String key : keys){
            System.out.print(key+" ");
        }
        System.out.println();
        Collection<Integer> values=map.values();
        for (Integer value : values){
            System.out.print (value+" ");
        }
        System.out.println();

    }
}
