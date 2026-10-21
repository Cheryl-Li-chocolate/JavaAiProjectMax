package demo1createThread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Mythread mt = new Mythread("线程1");
        mt.start();
        for(int i=0;i<5;i++){
            System.out.println("主线程"+i);
        }
    }
}

class Mythread extends Thread{
    public Mythread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("子线程"+i);
        }
    }
}
