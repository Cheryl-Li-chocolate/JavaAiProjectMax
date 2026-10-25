package com.ithiema.demo2reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private String name;
    private int age;
    private String sex;
    private String address;

}
