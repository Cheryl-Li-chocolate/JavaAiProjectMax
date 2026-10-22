package demo7executorService;

import java.util.concurrent.Callable;

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

        }
        System.out.println(Thread.currentThread().getName()+" "+"计算结束，结果是"+sum);

        return "1-"+n+"的和是"+sum;
    }


}
