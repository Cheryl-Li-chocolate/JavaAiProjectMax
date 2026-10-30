package com.itheima.demo2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> peopleNum=new TreeSet<>();
        List<Integer> people=new ArrayList<>();
        while(peopleNum.size()<100){
            int num=(int) (Math.random()*200)+1;
            peopleNum.add(num);

        }
        people.addAll(peopleNum);
        System.out.println(people);
        System.out.println("幸存者编号:"+killPeople(people));
        System.out.println("幸存者编号:"+killPeople2(peopleNum));
    }
    public static  List<Integer> killPeople(List<Integer> people){
        if (people.size()<=1)
            return people;
        List<Integer> newPeople =new ArrayList<>();
        for (int i=0;i<people.size();i++){
            if(i%2==1){
                newPeople.add(people.get(i));
            }
        }
        return killPeople(newPeople);

    }
    public static Set<Integer> killPeople2(Set<Integer> people){
        if(people.size()<=1)
            return people;
        Iterator<Integer> it=people.iterator();
        int count=0;
        while(it.hasNext()){
            it.next();
            count++;
            if (count%2==1)
                it.remove();
        }
        return killPeople2(people);
    }
}
