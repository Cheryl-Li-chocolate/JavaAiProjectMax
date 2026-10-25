package com.ithiema.demo2reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    @Test
    public void getClassInfo() {
        //目标：获取类的信息
        Class c1 = Dog.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
    }

    @Test
    public void getConstructorInfo() throws Exception {
        Class c2 = Dog.class;
        Constructor[] constructors = c2.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "(" + constructor.getParameterCount() + ")");
        }
        System.out.println("-------------");
        Constructor con = c2.getDeclaredConstructor(String.class, int.class);
        System.out.println(con.getName() + "(" + con.getParameterCount() + ")");
        System.out.println("-------------");
        Dog d1 = (Dog) con.newInstance("Alice", 3);
        System.out.println(d1.getName() + " " + d1.getAge());
        Constructor con2 = c2.getDeclaredConstructor(String.class);
        //暴力反射，跳过访问检查
        con2.setAccessible(true);
        Dog d2=(Dog) con2.newInstance("Bob");
        System.out.println(d2.getName());


    }

    @Test
    public void getFieldInfo() throws Exception {
        //获取类的成员变量对象
        Class c3 = Dog.class;
        Field[] fields = c3.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getName() + "(" + field.getType().getName() + ")");
        }
        Field field = c3.getDeclaredField("name");
        System.out.println(field.getName() + "(" + field.getType().getName() + ")");
        field.setAccessible(true);
        Dog d1=new Dog(3);
        field.set(d1,"Alice");
        System.out.println(d1);

        String name=(String)field.get(d1);
        System.out.println(name);

    }

    @Test
    public void getMethodInfo() throws Exception {
        Class c4 = Dog.class;
        Method[] methods = c4.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }
        Method method = c4.getDeclaredMethod("eat", String.class);
        Method method2 = c4.getDeclaredMethod("eat");
        System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        System.out.println(method2.getName() + "(" + method2.getParameterCount() + ")");

        Dog d1=new Dog(3);
        System.out.println(d1);
        Object result = method.invoke(d1, "肉");
        System.out.println(result);
        Object result2 = method2.invoke(d1);
        System.out.println(result2);
    }
}
