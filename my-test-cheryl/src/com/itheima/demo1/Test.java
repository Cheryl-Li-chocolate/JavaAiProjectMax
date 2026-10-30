package com.itheima.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Test {
    public static void main(String[] args) {
        List<Ball> redBalls=initBall("red",35);
        List<Ball> blueBalls=initBall("blue",15);

        List<Ball> randRedBalls=randBalls(redBalls,6);
        List<Ball> randBlueBalls=randBalls(blueBalls,1);

        randRedBalls.sort((o1,o2)->o1.getNumber()-o2.getNumber());
        List<Ball> allBalls=new ArrayList<>();
        allBalls.addAll(randRedBalls);
        allBalls.addAll(randBlueBalls);
        printBalls(allBalls);






    }
    public static List<Ball> initBall(String color,int count){
        List<Ball> balls=new ArrayList<>();
        for(int i=1;i<=count;i++){
            balls.add(new Ball(color,i));
        }
        return balls;
    }
    public static  List<Ball> randBalls(List<Ball> balls,int count){
        List<Ball> randBalls=new ArrayList<>();
        Random r=new Random();
        //随机不重复count个数的球
        for(int i=0;i<count;i++){
            int index=r.nextInt(balls.size()-i);
            randBalls.add(balls.get(index));
            balls.remove(index);
        }
        return randBalls;

    }

    public static void printBalls(List<Ball> balls){
        for(Ball ball:balls){
            System.out.print(ball+" ");
        }
        System.out.println();
    }
}
