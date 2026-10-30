package com.itheima.demo1;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> redBalls = new TreeSet<>();
        int redRandBall;
        while (redBalls.size() < 6) {
            redRandBall = (int) (Math.random() * 35) + 1;
            redBalls.add(redRandBall);
        }
        int blueRandBall = (int) (Math.random() * 15 + 1);
        System.out.println("红球号码:" + redBalls + " 蓝球号码:" + blueRandBall);
        Collection<Integer> red = new TreeSet<>();
        Collections.addAll(red, 10, 12, 30, 16, 7, 17, 12);
        int blue = 12;
        System.out.println("红球中奖号码:" + red + " 蓝球中奖号码:" + blue);

        int redCount = 0;
        for (Integer r : redBalls) {
            if (red.contains(r)) {
                redCount++;

            }
        }

        System.out.println("红球中奖个数:" + redCount);
        System.out.println("蓝球中奖个数:" + (blue == blueRandBall ? 1 : 0));
    }}
