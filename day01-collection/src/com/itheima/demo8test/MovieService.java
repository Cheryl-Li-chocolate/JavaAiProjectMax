package com.itheima.demo8test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //1.准备一个集合容器，存储全部电影，操作需要在容器里面
    private static List<Movie> movies = new ArrayList<>();
    //static 修饰变量，属于类只有一份，被类的全部对象共享，与类加载一次会被后面赋值覆盖
    private static Scanner sc = new Scanner(System.in);

    //整个系统只需要一个扫描器接收数据，定义成静态节省内存
    public void start() {
        //2.准备操作界面
        while (true) {
            System.out.println("===电影信息操作系统===");
            System.out.println("1.上架");
            System.out.println("2.下架某个电影");
            System.out.println("3.查询某个电影");
            System.out.println("4.封杀某个明星");
            System.out.println("5.退出系统");
            System.out.println("6.展示所有电影");

            System.out.println("请输入你的选择：");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 上架电影（独立功能独立成方法）
                    //把电影信息封装成电影对象
                    //把电影对象添加到集合中
                    addMovie();
                    break;
                case "2":
                    // 下架电影
                    deleteMovie();
                    break;
                case "3":
                    // 查询电影
                    queryMovie();
                    break;
                case "4":
                    // 封杀明星
                    deleteStar();
                    break;
                case "5":
                    // 退出系统
                    System.out.println("感谢使用！");
                    return;//干掉整个start方法
                case "6":
                    // 展示所有电影
                    queryAllMovie();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    /**
     * 下架电影
     */
    private void deleteMovie() {
        System.out.println("===下架电影===");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        //根据电影名称查询电影对象并返回，展示这个对象数据
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            movies.remove(movie);
            System.out.println("下架成功！");
        } else {
            System.out.println("未找到该电影！");
        }
        queryAllMovie();
    }

    /**
     * 展示所有电影
     */
    private void queryAllMovie() {
        System.out.println("===展示所有电影===");
        for (Movie m : movies) {

            System.out.println("电影：" + m.getName() + ", 评分：" + m.getScore() + ", 主演：" + m.getActor() + ", 价格：" + m.getPrice());
        }
    }

    /**
     * 封杀明星
     */
    private void deleteStar() {
        System.out.println("===封杀明星===");
        System.out.println("请输入明星名称：");
        String name = sc.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            if (m.getActor().contains(name)) {
                movies.remove(i);
                System.out.println("封杀成功！");
                i--;//退一步，防止并发修改异常
            }
        }
        System.out.println("封杀成功！");
        queryAllMovie();
    }

    /**
     * 查询电影
     */
    private void queryMovie() {
        System.out.println("===查询电影===");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        //根据电影名称查询电影对象并返回，展示这个对象数据
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            System.out.println(movie);
        } else {
            System.out.println("未找到该电影！");
        }
    }

    //根据电影名称查询电影对象并返回
    private Movie queryMovieByName(String name) {
        //增强for循环
        for (Movie m : movies) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    /**
     * 上架电影
     */
    private void addMovie() {
        System.out.println("===上架电影===");
        //1.创建电影对象，封装电影信息
        Movie movie = new Movie();
        //2.给电影对象注入数据
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影评分：");
        double score = sc.nextDouble();
        movie.setScore(score);
        System.out.println("请输入电影主演：");
        movie.setActor(sc.next());
        System.out.println("请输入电影价格：");
        movie.setPrice(sc.nextDouble());
        movies.add(movie);


        //3.把电影对象添加到集合中
        System.out.println("上架成功");
    }
}
