package com.itheima.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> idSet = new TreeSet<>();
        List<Prisoner> prisoners = new ArrayList<>();
        while (idSet.size() < 100) {
            int id = (int) (Math.random() * 200) + 1;
            idSet.add(id);
        }
        List<Integer> idList = new ArrayList<>();
        idList.addAll(idSet);

        for (int i = 1; i <= 100; i++) {
            prisoners.add(new Prisoner(idList.get(i-1),  i));
        }
        System.out.println(prisoners);
        while (prisoners.size() > 1){
            List<Prisoner> newPrisoners = new ArrayList<>();
            for (int i = 0; i < prisoners.size(); i++) {
                if (i % 2 == 1) {
                    newPrisoners.add(prisoners.get(i));
                }
            }
            prisoners = newPrisoners;

        }
        System.out.println(prisoners);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Prisoner {
    private int id;
    private int firstPos;
}