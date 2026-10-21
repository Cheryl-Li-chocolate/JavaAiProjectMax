package demo6_lock;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Account acc = new Account("小红，小明的账户", 1000);
        BankThread t1 = new BankThread("小明", acc, 1000);
        BankThread t2 = new BankThread("小红", acc, 1000);
        t1.start();
        t2.start();
    }
}

class BankThread extends Thread{
    Account acc;
    double money;
    public BankThread(String name, Account acc, double money) {
        super(name);
        this.acc = acc;
        this.money = money;
    }
    @Override
    public void run() {
        acc.drawMoney(money);

    }
}