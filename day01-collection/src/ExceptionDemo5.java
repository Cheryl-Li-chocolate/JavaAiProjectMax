import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        //认识异常的体系，搞清楚异常的基本作用
        while (true) {
            try {
                double price=userInputPrice();
                System.out.println("商品价格是："+price);
                break;
            } catch (Exception e) {
                e.printStackTrace();//打印异常信息
                System.out.println("输入的价格有误，请重新输入！");
            }
        }
    }
    public static double userInputPrice() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品价格：");
        double price=sc.nextDouble();
        return price;


    }

}
