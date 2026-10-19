package com.ithima.demo2recursion;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //递归解决猴子吃桃问题
        //公式：f(n+1) =f(n)- f(n) / 2 -1
        //f(n) = 2 * (f(n+1)+1)
        //递归结束条件f(10)=1
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
        System.out.println(f(5));


    }

    public static int f(int n) {
        if (n == 10)
            return 1;
        else
            return 2 * (f(n + 1) + 1);
    }
}
