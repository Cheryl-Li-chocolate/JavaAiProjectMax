package com.ithiema.demo3annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo {
    @Test
    public void parseClass() {
        Class c1 = Demo.class;

        if (c1.isAnnotationPresent(MyTest1.class)) {
            MyTest1 myTest1 = (MyTest1) c1.getAnnotation(MyTest1.class);
            String[] address = myTest1.address();
            System.out.println(Arrays.toString(address));
            System.out.println(myTest1.value());
            System.out.println(myTest1.height());

        }
    }
    @Test
    public void parseMethod() throws Exception {
        Class c1 = Demo.class;
        Method method=c1.getMethod("go");

        if (method.isAnnotationPresent(MyTest1.class)) {
            MyTest1 myTest1 = method.getAnnotation(MyTest1.class);
            String[] address = myTest1.address();
            System.out.println(Arrays.toString(address));
            System.out.println(myTest1.value());
            System.out.println(myTest1.height());

        }
    }
}