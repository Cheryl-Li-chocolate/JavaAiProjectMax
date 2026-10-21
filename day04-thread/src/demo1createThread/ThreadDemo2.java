package demo1createThread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThreadTask myThreadTask = new MyThreadTask();
        Thread thread =new Thread(myThreadTask);
        thread.start();
        for (int i = 0; i < 5; i++)
//            System.out.println(Thread.currentThread().getName() + " " + i);
                    System.out.println("主线程 " + i);


    }
}

class MyThreadTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
            System.out.println("子线程 " + i);
        }
    }
}
