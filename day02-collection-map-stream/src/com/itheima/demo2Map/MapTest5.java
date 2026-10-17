package com.itheima.demo2Map;

import java.util.*;

public class MapTest5 {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        List<String> votes = new ArrayList<>();
        String[] locations = {"北京", "上海", "广州", "深圳"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(locations.length);
            votes.add(locations[index]);
        }
        Map<String, Integer> voteResult = new HashMap<>();
        for (String vote : votes) {
            if (voteResult.containsKey(vote)) {
                voteResult.put(vote,voteResult.get(vote)+1);
            } else {
                voteResult.put(vote,1);
            }

        }
        System.out.println("投票结果如下：");
        voteResult.forEach((k,v)->System.out.println(k+" : "+v));

    }
}
