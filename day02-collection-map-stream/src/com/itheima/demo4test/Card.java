package com.itheima.demo4test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    String size;
    String color;
    int num;

    @Override
    public String toString() {
        return color + size + " ";
    }
}
