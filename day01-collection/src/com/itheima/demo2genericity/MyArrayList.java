package com.itheima.demo2genericity;

import java.util.ArrayList;

public class MyArrayList<E> {
    ArrayList<E> list=new ArrayList<>();
    public boolean add(E e){
        return list.add(e);

    }
    public E get(int index){
        return list.get(index);
    }



}
