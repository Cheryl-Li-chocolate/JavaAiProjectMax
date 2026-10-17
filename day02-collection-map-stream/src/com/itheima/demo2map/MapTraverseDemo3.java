package com.itheima.demo2map;

import java.util.HashMap;
import java.util.Map;

public class MapTraverseDemo3 {
    public static void main(String[] args) {
        // Map集合的遍历方式二：键值对
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",18);
        map.put("李四",20);
        map.put("王五",22);
        map.put("赵六",24);
        System.out.println(map);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}