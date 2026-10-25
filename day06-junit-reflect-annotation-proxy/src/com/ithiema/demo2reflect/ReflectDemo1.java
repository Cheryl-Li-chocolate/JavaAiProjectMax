package com.ithiema.demo2reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        System.out.println(c1);

        Class c2 = Class.forName("com.ithiema.demo2reflect.Student");
        System.out.println(c2);

        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c3);
    }
}
