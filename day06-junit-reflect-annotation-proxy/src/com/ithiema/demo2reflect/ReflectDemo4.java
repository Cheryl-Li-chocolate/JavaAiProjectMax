package com.ithiema.demo2reflect;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Buddy", 3);
        SaveObjectFrameWork.saveObject(dog);

        Student student = new Student("Alice", 20, "Female", "123 Main St");
        SaveObjectFrameWork.saveObject(student);

    }
}
