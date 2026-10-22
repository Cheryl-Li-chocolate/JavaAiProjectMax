package demo7executorService;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
