package com.ithima.demo2recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        // 需求: 使用递归打印1-5
        System.out.println(f(5));
    }

    public static int f(int n) {
        // 递归结束条件
        if(n == 1)
            return 1;
        else
            return f(n-1)*n;

    }
}
