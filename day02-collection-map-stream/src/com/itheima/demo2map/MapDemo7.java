package com.itheima.demo2map;

import com.itheima.demo1hashset.Teacher;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo7 {
    public static void main(String[] args) {
        //目标：TreeMap集合（原理和用法于TreeSet一样）
        Map<Teacher,String> map = new TreeMap<>((o1,o2)->Double.compare(o1.getSalary(),o2.getSalary()));
        map.put(new Teacher("张三",18,1000),"A");
        map.put(new Teacher("李四",19,2000),"B");
        map.put(new Teacher("王五",20,3000),"C");
        System.out.println(map);

    }

}
