package com.ithiema.demo2reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
       //反射可以绕过泛型的约束
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("abc");
        list.add("123");

        Class c1=list.getClass();
        Method method=c1.getDeclaredMethod("add",Object.class);
        method.invoke(list,1);
        method.invoke(list,true);
        System.out.println(list);
    }
}
