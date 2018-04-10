package com.yeying.exercise.homework.newchapter5.Exercise2;

public class CountTest {
    public static void output(int res) {
        System.out.println("现在的计数器为："+res);
    }
    public static void main(String[] args) {
        Count count = new Count();
        count.setCount(10);
        count.increment();
        CountTest.output(+count.getCount());
        count.decrement();
        CountTest.output(+count.getCount());
        count.reset();
        CountTest.output(+count.getCount());
    }
}
