package com.itheima.demo3genericity;

public interface Data<T> {
    void add(T t);
    void delete(T t);
    T get(int index);
}
