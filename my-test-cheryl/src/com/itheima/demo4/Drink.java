package com.itheima.demo4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drink {
    private String name;
    private int weight;
    private double price;
    private double value;
    public Drink(String name, int weight, double price){
        this.name=name;
        this.weight=weight;
        this.price=price;
        this.value=price/(double)weight;
    }

}
