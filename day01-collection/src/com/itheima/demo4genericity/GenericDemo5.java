package com.itheima.demo4genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new Car());
        cars.add(new Xiaomi());

        ArrayList<Xiaomi> xiaomis=new ArrayList<>();
        xiaomis.add(new Xiaomi());

        ArrayList<BYD> byds=new ArrayList<>();
        byds.add(new BYD());

        go(cars);
        go2(xiaomis);
        go2(byds);
        go2(cars);

    }
    public static void go(ArrayList<Car> cars){
        System.out.println("进入普通车库（不包含子类车）");

    }
    public static void go2(ArrayList<? extends Car> cars){
        System.out.println("进入通用车库");
    }
}
