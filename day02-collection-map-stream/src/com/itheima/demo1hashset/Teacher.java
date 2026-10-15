package com.itheima.demo1hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString () {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }
    @Override
    public int compareTo (Teacher o){

            return this.getAge() >= o.getAge() ? 1 : -1;


    }

}
