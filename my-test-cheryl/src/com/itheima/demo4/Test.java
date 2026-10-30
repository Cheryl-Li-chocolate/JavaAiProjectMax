package com.itheima.demo4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Drink> allDrink = new ArrayList<>();
        allDrink.add(new Drink("水", 4, 24));
        allDrink.add(new Drink("牛奶", 8, 160));
        allDrink.add(new Drink("五粮液", 2, 4000));
        allDrink.add(new Drink("可乐", 6, 108));
        allDrink.add(new Drink("茅台", 1, 4000));
        System.out.println(allDrink);
        List<Drink> sortedPriceDrink = allDrink.stream().sorted((d1, d2) -> Double.compare(d2.getValue(), d1.getValue())).toList();
        List<Drink> includeDrink = new ArrayList<>();


        System.out.println(sortedPriceDrink);
        int weight = 0;


        for (Drink drink : sortedPriceDrink) {
            int onedrinkweight = drink.getWeight();
            if (weight >= 10) break;


            int count = 0;
            while (onedrinkweight > 0 && weight < 10) {
                weight++;
                onedrinkweight--;
                count++;
                drink.setWeight(onedrinkweight);
            }
            includeDrink.add(new Drink(drink.getName(), count, count * drink.getValue()));


        }
        System.out.println("由这些液体组成：" + includeDrink.toString());
        System.out.println("总价格为：" + includeDrink.stream().mapToDouble(Drink::getPrice).sum());
    }
}
