import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //认识异常的体系，搞清楚异常的基本作用
        try{
            show2();
        }catch (ParseException e){
            e.printStackTrace();//打印异常信息
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
    public static void show2() throws ParseException, FileNotFoundException {
        String str="2024-07-09 11:12:13";
        //把字符串时间解析成Java中的一个日期对象。
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy--MM-dd HH:mm:ss");
        Date date=sdf.parse(str);
        System.out.println(date);

        InputStream is =new FileInputStream("D:/1.png");
    }
    public static void show(){
//        //ArrayIndexOutOfBoundsException
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);
//        //ArithmeticException//继承RuntimeException
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);
//        //NullPointerException
//        String str = null;
//        System.out.println(str);
//        System.out.println(str.length());
    }

}
