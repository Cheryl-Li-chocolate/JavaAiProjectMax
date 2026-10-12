package com.itheima.demo7list;

import java.util.LinkedList;

public class ListDemo1 {
    public static void main(String[] args) {
        //目标：用LinkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("张三");
        queue.addLast("李四");
        queue.addLast("王五");
        queue.addLast ("赵六");
        System.out.println(queue);

        //出队
        queue.removeFirst();
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("===================");
        //目标：用LinkedList做一个栈对象
        LinkedList<String> stack =new LinkedList<>();
        //入栈
        stack.push("张三");//就是装饰了addFirst方法
        stack.push("李四");
        stack.push("王五");
        stack.push("赵六");
        System.out.println(stack);
        //出栈
        System.out.println(stack.pop());//就是装饰了removeFirst方法
        System.out.println(stack);
    }


}
