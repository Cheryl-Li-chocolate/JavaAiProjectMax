package com.itheima.demo4test;

import java.util.*;

public class Room {

    List<Card> allCards = new ArrayList<>();

    {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int num=0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                Card card = new Card(size, color,num);
                allCards.add(card);
            }
        }
        Collections.addAll(allCards, new Card("", "🃏",++num), new Card("", "🃏",++num));
        System.out.println("初始化:" + allCards);
    }

    public void startGame() {
        Collections.shuffle(allCards);
        System.out.println("洗牌后:" + allCards);
        String[] players = {"张三", "李四", "王五"};
        Map<String, List<Card>> playerCards = new HashMap<>();
        List<Card> player1Cards = new ArrayList<>();
        List<Card> player2Cards = new ArrayList<>();
        List<Card> player3Cards = new ArrayList<>();
        playerCards.put(players[0], player1Cards);
        playerCards.put(players[1], player2Cards);
        playerCards.put(players[2], player3Cards);

        List<Card> lastCards=new ArrayList<>(allCards.subList(allCards.size()-3,allCards.size()));


        for (int i = 0; i < allCards.size(); i++) {
            if (i % 3 == 0)
                player1Cards.add(allCards.get(i));
            if (i % 3 == 1)
                player2Cards.add(allCards.get(i));
            if (i % 3 == 2)
                player3Cards.add(allCards.get(i));
        }
        player3Cards.addAll(lastCards);
        sortCards(player1Cards);
        sortCards(player2Cards);
        sortCards(player3Cards);

        for(Map.Entry<String,List<Card>> entry:playerCards.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    private void sortCards(List<Card> playerCard) {
//        Collections.sort(playerCards,new Comparator<Card>(){
//            @Override
//            public int compare(Card o1, Card o2)->{
//                return o2.getNum() - o1.getNum();
//            }
//        });
        Collections.sort(playerCard,(o1,o2)->o2.getNum()-o1.getNum());

    }


}
