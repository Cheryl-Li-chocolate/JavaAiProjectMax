package demo3threadsafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String name;
    private double money;
    public void drawMoney(double money){
        System.out.println(this.getName()+"取钱"+money);
        this.money-=money;
        System.out.println(this.getName()+"余额"+this.money);
    }
}
