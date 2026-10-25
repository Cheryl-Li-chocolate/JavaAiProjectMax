package com.ithiema.demo3annotation;

@MyTest1(value = "Alice", height = 180, address = {"beijing", "shanghai"})
public class Demo {

    @MyTest1(value = "Bob", height = 175, address = {"guangzhou", "shenzhen"})
    public void go() {
    }

}
