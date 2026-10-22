package demo7executorService;

import demo7executorService.MyRunnable;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        MyRunnable task = new MyRunnable();
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
//        pool.shutdown();// 线程池正常关闭
//        pool.shutdownNow(); // 线程池立即关闭,
    }
}
