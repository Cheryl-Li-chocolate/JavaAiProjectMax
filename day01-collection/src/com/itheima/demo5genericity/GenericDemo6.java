package com.itheima.demo5genericity;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args)
    {
        //基本数据类型变成包装对象
        //Integer i=new Integer(100)
       Integer i1=Integer.valueOf(100);
       Integer i2=Integer.valueOf(100);
        System.out.println(i1==i2);
        Integer i3=Integer.valueOf(130);
        Integer i4=Integer.valueOf(130);
        System.out.println(i3==i4);

        Integer it1=100;
        Integer it2=100;
        System.out.println(it1==it2);

        Integer it3=130;
        Integer it4=130;
        System.out.println(it3==it4);

        int iti1=it3;
        int iti2=it4;
        System.out.println(iti1==iti2);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);//自动装箱，这个100已经是对象，自动转换成包装类型

        int rs=list.get(0);//取出来的是对象，然后实现自动拆箱可以用基本数据类型来接

        //包装类新增的功能
        //1.把基本类型的数据转换成字符串
        String str1=Integer.toString(100);
        System.out.println(1+Integer.toString(100));

        Integer i8 =100;
        String str2=i8.toString();
        System.out.println(2222+i8.toString());

        int i9=100;
        String  str3=i9+"";
        System.out.println(i9+""+100);
        //2.把字符串类型转换成对应的基本数据类型（很有用）
        String str4="100";
        int i10 =Integer.parseInt(str4);
        System.out.println(Integer.parseInt(str4)+100);

        int i11=Integer.valueOf(str4);//自动拆箱
        System.out.println(i11+100);

        double d1=Double.valueOf("3.14");
        System.out.println(d1+100);





    }
}
