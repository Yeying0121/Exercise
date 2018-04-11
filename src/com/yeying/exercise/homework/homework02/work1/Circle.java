package com.yeying.exercise.homework.homework02.work1;

public class Circle extends PlanarGraph {
    private double r;
    private final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    /*
     *获取圆面积模块
     * 无输入
     * 输出为圆的面积
     */
    public void getArea() {
        double area =  PI*r*r;
        System.out.println("圆形的面积为" +area);
    }

    /*获取圆周长模块
    * 无输入
    * 输出为圆周长
    */
    public void getPerimeter() {
        double perimeter = 2*PI*r;
        System.out.println("圆形的周长为" +perimeter);
    }
}
