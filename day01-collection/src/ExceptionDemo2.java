public class ExceptionDemo2 {
    public static void main(String[] args) {
        //认识异常的体系，搞清楚异常的基本作用
        try {
            System.out.println(div(10,0));
            System.out.println("底层方法执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败"); // This line will never be reached
        }
        System.out.println("程序继续执行");
    }
    public static int div(int a,int b)throws Exception{
        if(b==0)
        {
            //throw new RuntimeException("除数不能为0");//抛运行时异常
            throw new Exception("除数不能为0");
        }
        return a/b;

}}
