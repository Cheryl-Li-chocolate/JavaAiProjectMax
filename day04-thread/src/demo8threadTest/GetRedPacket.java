package demo8threadTest;

import java.util.List;

public class GetRedPacket extends Thread{
    private List<Integer> redacket;
    private String name;
    public GetRedPacket(List<Integer> redacket,String name){
        this.redacket=redacket;
        this.name=name;
    }
    @Override
    public void run(){
        String name=Thread.currentThread().getName();
        while(true){
            synchronized (redacket){
                if(redacket.size()==0)
                    break;
                int index=(int)Math.random()*redacket.size();
                int money=redacket.remove(index);
                System.out.println(name+"获取红包"+money);
                if(redacket.size()==0){
                    System.out.println("活动结束!");
                    break;
                }

            }
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
