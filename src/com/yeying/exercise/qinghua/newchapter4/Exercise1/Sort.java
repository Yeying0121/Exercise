package com.yeying.exercise.qinghua.newchapter4.Exercise1;

public class Sort {
    public static void main(String[] args) {
        String[] words = new String[]{"a", "c", "u", "b", "e", "p", "f", "z"};
        System.out.print("排序前的字母为：");
        for (String i : words) {
            System.out.print( i + " ");
        }
        for(int i=words.length-1; i>=0; i--) {
            for(int j=0; j<i; j++) {
                if(words[j].compareTo(words[j+1])<0) {
                    String tmp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = tmp;
                }
            }
        }
        System.out.print("排序后的字母为：");
        for(String i : words) {
            System.out.print(i+" ");
        }
    }
}
