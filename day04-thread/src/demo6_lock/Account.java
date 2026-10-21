package demo6_lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String name;
    private double money;
    private final Lock lk=new ReentrantLock();


    public synchronized void drawMoney(double money) {
        lk.lock();
            if (this.money >= money) {
                System.out.println(Thread.currentThread().getName() + "取钱" + money);
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + "余额" + this.money);
            } else {
                System.out.println(Thread.currentThread().getName() + "余额不足");
            }
        lk.unlock();
        }


}