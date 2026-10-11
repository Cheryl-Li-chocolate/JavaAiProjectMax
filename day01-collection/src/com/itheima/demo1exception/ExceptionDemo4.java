package com.itheima.demo1exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        try {
            saveAge(-1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("年龄非法");
        }
        System.out.println("程序继续执行");


    }
    public static void saveAge(int age)  {
        if(age<1||age>200){
            //年龄非法，抛出去一个异常返回

            throw new ItheimaAgeIllegalRuntimeException("年龄非法");
        }else{
            System.out.println("年龄合法");
            System.out.println("年龄是："+age);
        }
    }
}
