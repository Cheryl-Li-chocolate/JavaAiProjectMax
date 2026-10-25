package com.ithiema.demo3annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo2 {
    public static void main(String[] args) throws Exception {
        AnnotationDemo2 ad = new AnnotationDemo2();
        Class c = AnnotationDemo2.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                for (int i = 0; i < count; i++)
                    method.invoke(ad);
            }
        }
    }

    @MyTest(count = 5)
    public void test() {
        System.out.println("test");
    }


    public void test2() {
        System.out.println("test2");
    }

    @MyTest(count = 2)
    public void test3() {
        System.out.println("test3");
    }


}
