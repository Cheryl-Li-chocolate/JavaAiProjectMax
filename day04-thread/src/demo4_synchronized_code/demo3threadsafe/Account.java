package demo4_synchronized_code.demo3threadsafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String name;
    private double money;

    public void drawMoney(double money) {
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(Thread.currentThread().getName() + "取钱" + money);
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + "余额" + this.money);
            } else {
                System.out.println(Thread.currentThread().getName() + "余额不足");
            }
        }
    }
}