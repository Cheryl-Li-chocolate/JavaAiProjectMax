package demo1createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        MyCallable mycall=new MyCallable(100);
        FutureTask ft =new FutureTask(mycall);
        new Thread(ft).start();
        int sum=0;
        for (int i = 1; i <= 20; i++){
            sum+=i;
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

        try {
            System.out.println(ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("1-20的和是"+sum);


    }
}

class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 1; i <= n; i++){
            sum+=i;
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

        return "1-"+n+"的和是"+sum;
    }


}
