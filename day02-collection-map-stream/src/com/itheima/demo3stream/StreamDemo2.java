package com.itheima.demo3stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        Stream<String> s1=list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> s2=set.stream();

        Map<String,Integer> map=new HashMap<>();
        Stream<String> s5=map.keySet().stream();
        Stream<Integer> s6=map.values().stream();
        Stream<Map.Entry<String,Integer>> s7=map.entrySet().stream();



        String[] arr= {"a","b","c"};
        Stream<String>s3=Arrays.stream(arr);
        Stream<String> s4=Stream.of(arr);





    }



}
