package com.ithiema.demo2reflect;

public class Dog {
    private String name;
    private int age;
    private Dog(){}
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age){
        this.age = age;
    }
    private void show(){
        System.out.println("hello");
    }

    public String eat(String food){
        System.out.println("吃"+food);
        return "吃完了";
    }
    public void eat(){
        System.out.println("吃啦");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
