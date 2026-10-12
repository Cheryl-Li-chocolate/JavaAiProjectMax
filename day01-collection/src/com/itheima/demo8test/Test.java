package com.itheima.demo8test;

public class Test {
    public static void main(String[] args) {
        //目标：完成电影案例
        //1 .每部电影都是一个电影对象，设计电影类。
        //2 .需要定一个电影操作类，其对象专门用于处理电影数据的业务
        //3 .操作类中需要定义一个集合存放全部的电影对象
        MovieService movieService = new MovieService();
        movieService.start();


    }
}
