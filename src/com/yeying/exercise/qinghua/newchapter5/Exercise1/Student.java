package com.yeying.exercise.qinghua.newchapter5.Exercise1;

public class Student {
    private int studentid = 12345;
    private String classes = "初一三班";
    private String sex = "女";
    private int age = 12;
    public int getStudentId() {
        return studentid;
    }

    public String getClasses() {
        return classes;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
    public void changeAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "这个学生是"+sex+"的，而且她的学号为："+studentid+"，她在"+classes+"，现在"+age+"岁";
    }
}
