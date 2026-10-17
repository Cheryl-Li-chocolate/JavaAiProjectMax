package com.itheima.demo2Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo2 {
    public static void main(String[] args) {
        // Map集合的遍历方式一：键找值
        Map<String,Integer>map=new HashMap<>();
        map.put("张三",18);
        map.put("李四",20);
        map.put("王五",22);
        map.put("赵六",24);
        System.out.println(map);
    Set<String> keys=map.keySet();
    for (String key:keys){
        System.out.println(key+":"+map.get(key));
    }

    }

}
