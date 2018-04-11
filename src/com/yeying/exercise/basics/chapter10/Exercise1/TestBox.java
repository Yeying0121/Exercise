package com.yeying.exercise.basics.chapter10.Exercise1;

public class TestBox {
    Integer i = new Integer(5);
    int j;
    public  static  void  main(String[] args) {
        TestBox t = new TestBox ();
        t.go();
    }

    public void go () {
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
