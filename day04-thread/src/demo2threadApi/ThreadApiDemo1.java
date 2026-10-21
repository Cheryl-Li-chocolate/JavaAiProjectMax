package demo2threadApi;

public class ThreadApiDemo1 {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        System.out.println("开始");
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 运行了");
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        System.out.println("结束");
    }
}
