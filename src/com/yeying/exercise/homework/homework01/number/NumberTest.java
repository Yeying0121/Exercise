package com.yeying.exercise.homework.homework01.number;

import java.util.*;

public class NumberTest {

    /*
     * 获取输入的模块
     * 输入是键盘的输入，通过Scanner获取字符串，输入格式例如: 1 2 4 5
     * 输出 List<Integer>
     */
    public static List<Integer> getInputList() {
        List<Integer> result = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要组合的数字（提示：输入的数字大小应在0~9之间）：");
        String[] str = scan.nextLine().split(" ");//获得输入的字符,并以空格为分割
        for (int i = 0; i < str.length; i++) {
            int tmp = Integer.parseInt(str[i]);
            result.add(tmp);
        }
        return result;
    }

    /*
     * 模拟输入的模块
     * 输入 无
     * 输出 List<Integer>
     *  这样我们就不用一直输入了
     */
    public static List<Integer> mockInputList() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
//        result.add(4);
//        result.add(5);
        return result;
    }

    /*
     * 常用的输出模块
     */
    public static void output(Object s) {

        System.out.println(s);
    }
    /*
     *排列组合模块
     * 输入为main模块调用传递过来的list
     * 循环组合，并使用HashSet将组合中的重复元素剔除
     * 输出为排列组合后的结果和总数
     */

    public static int combination(List<Integer> list) {
        int result = 0;
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    if (i != j && i != k && j != k) {
                        Integer com = list.get(i) * 100 + list.get(j) * 10 + list.get(k);
                        output.add(com);
//                        break;
                    }
                }
            }
        }
        HashSet h = new HashSet(output);
        output.clear();
        output.addAll(h);
        result = output.size();
        //Object tmp = list;
        NumberTest.output(output);
        // TODO
        // 计算中间 NumberTest.output( tmp )

        // NumberTest.output( "可以组合为" + String.valueOf( result ) + "个三位数" )
        return result;
    }


    public static void main(String[] args) {
        // List<Integer> input = NumberTest.getInputList();
        List<Integer> input = NumberTest.mockInputList();
        int result = NumberTest.combination(input);
        System.out.println("可以组合为" + result + "个三位数");
    }
}
