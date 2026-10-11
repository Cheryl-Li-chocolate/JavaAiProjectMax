package com.itheima.demo1exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            saveAge(-1);
        } catch (ItheimaAgeIllegalException e) {
            e.printStackTrace();
        }

    }
    public static void saveAge(int age) throws ItheimaAgeIllegalException {
        if(age<1||age>200){
            //年龄非法，抛出去一个异常返回

            throw new ItheimaAgeIllegalException("年龄非法");
        }else{
            System.out.println("年龄合法");
            System.out.println("年龄是："+age);
        }
    }
}
