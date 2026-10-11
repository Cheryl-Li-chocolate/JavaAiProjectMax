package com.itheima.demo2genericity;

public class GenericDemo1 {
    public static void main(String[] args) {
        MyArrayList<Integer> mlist=new MyArrayList<>();
        mlist.add(1);
        mlist.add(2);
        System.out.println(mlist.get(0));
        System.out.println(mlist.get(1));
    }

}
