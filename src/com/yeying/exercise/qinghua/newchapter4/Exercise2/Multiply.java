package com.yeying.exercise.qinghua.newchapter4.Exercise2;

public class Multiply {
    public static void main(String[] args) {
        for(int i=1;i<10;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i+"×"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
