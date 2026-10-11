package com.itheima.demo3genericity;

import com.itheima.demo2genericity.MyArrayList;

public class GenericDemo3 {
    public static void main(String[] args) {
        Student s1=new Student();
        StudentData st=new StudentData();
        st.add(s1);
        st.add(new Student());
        st.delete(s1);

    }
}
