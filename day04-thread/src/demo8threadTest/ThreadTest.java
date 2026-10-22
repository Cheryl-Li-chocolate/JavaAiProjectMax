package demo8threadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) {
        List<Integer>redPacket=getRedPacket();
        for(int i=0;i<100;i++){
            new GetRedPacket(redPacket,"员工"+i).start();
        }

    }
    public static List<Integer> getRedPacket(){
        List<Integer> redPacket=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<160;i++){
            redPacket.add(r.nextInt(30)+1);
        }
        for (int i=0;i<40;i++){
            redPacket.add(r.nextInt(70)+31);
        }
        return redPacket;
    }
}
