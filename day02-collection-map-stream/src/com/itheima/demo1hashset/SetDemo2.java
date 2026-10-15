package com.itheima.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return Double.compare(o1.getSalary() , o2.getSalary());
            }
        });
        TreeSet<Teacher> set1 = new TreeSet<>(( o1,  o2) -> Double.compare(o1.getSalary() , o2.getSalary()));

        set.add(new Teacher("张三", 20, 52333.3));
        set.add(new Teacher("李四", 19, 50111.1));
        set.add(new Teacher("王五", 20, 7000.0));
        System.out.println(set);

    }
}
