package com.itheima.demo3genericity;

public class StudentData implements Data<Student>{

    @Override
    public void add(Student student) {
        System.out.println("添加学生信息");
    }

    @Override
    public void delete(Student student) {
        System.out.println("删除学生信息");
    }

    @Override
    public Student get(int index) {
        System.out.println("获取学生信息");
        return new Student();
    }

}
