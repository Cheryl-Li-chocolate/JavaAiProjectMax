package demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 10, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue<>(3), java.util.concurrent.Executors.defaultThreadFactory(), new java.util.concurrent.ThreadPoolExecutor.AbortPolicy());
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(200));
        Future<String> f3=pool.submit(new MyCallable(300));
        Future<String> f4=pool.submit(new MyCallable(400));
        Future<String> f5=pool.submit(new MyCallable(500));
        Future<String> f6=pool.submit(new MyCallable(600));
        Future<String> f7=pool.submit(new MyCallable(700));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());
            System.out.println(f6.get());
            System.out.println(f7.get());
            //正常应该分开try catch


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
