package demo1createThread;

public class ThreadDemo2_2 {
    public static void main(String[] args) {

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++)
//                    System.out.println(Thread.currentThread().getName() + " " + i);
                    System.out.println(Thread.currentThread().getName() +" "+ i);
            }
        }).start();

        new Thread(()->{for (int i = 0; i < 5; i++) System.out.println(Thread.currentThread().getName() + " "+i);}).start();

        for (int i = 0; i < 5; i++)
//            System.out.println(Thread.currentThread().getName() + " " + i);
            System.out.println(Thread.currentThread().getName() + i);


    }
}

