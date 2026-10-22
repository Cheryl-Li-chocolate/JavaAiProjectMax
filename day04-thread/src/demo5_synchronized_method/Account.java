package demo5_synchronized_method;

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
    public void drawMoney(double money) {
        lk.lock();
        try {
            if (this.money >= money) {
                System.out.println(Thread.currentThread().getName() + "取钱" + money);
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + "余额" + this.money);
            } else {
                System.out.println(Thread.currentThread().getName() + "余额不足");
            }

        } finally {
            lk.unlock();
        }
    }
}