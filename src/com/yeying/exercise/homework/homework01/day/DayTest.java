package com.yeying.exercise.homework.homework01.day;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DayTest {
    /*
     * 获取输入的模块
     * 输入是键盘的输入，通过Scanner获取字符串，输入格式例如: 1 2 4 5
     * 输出 List<Integer>
     */
    public static List<Integer> getInputList() {
        List<Integer> result = new ArrayList<>();
        Scanner scan = new Scanner(System.in);//调用Scanner类
        System.out.println("请输入年、月、日：");
        String str[] = scan.nextLine().split("、");//取得键盘输入，并以、为分割符
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
        result.add(2018);
        result.add(3);
        result.add(23);
        return result;
    }
    /*
    *判断日期是周几模块
    * 输入为模拟输入模块里的list
    * 先判断输入的日期是否为闰年，再以1970.1.1日为周四为标准，判断
    * 输出为判断的结果
     */

    public static void Day(List<Integer> list) {
        int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a1 = (list.get(0) - 1968 - 1) / 4;//
        int b1 = (list.get(0) - 1970 - 1) * 365 + a1;
        if ((list.get(0) % 4 == 0) && (list.get(0) % 100 != 0) || list.get(0) % 400 == 0) {
            int day1 = 0;
            for (int i = 0; i < list.get(1); i++) {
                if (list.get(2) > a[i] || list.get(2) <= 0) {
                    System.out.println("您的输入有误！");
                    System.out.println(0);
                }
                day1 += a[i];
            }
            int week = (b1 + day1 + list.get(2) + 4) % 7;
            if (week == 0) {
                System.out.println("这天是星期天！");
            } else {
                System.out.println(list.get(0) + "年" + list.get(1) + "月" + list.get(2) + "日是星期" + week);
            }
        } else {
            int day1 = 0;
            for (int i = 0; i < list.get(1); i++) {
                day1 += b[i];
            }
            int week = (b1 + day1 + list.get(2) + 4) % 7;
            if (week == 0) {
                System.out.println("这天是星期天！");
            } else {
                System.out.println(list.get(0) + "年" + list.get(1) + "月" + list.get(2) + "日是星期" + week);//同上，平年的判断方法
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> input = DayTest.mockInputList();
        DayTest.Day(input);
    }
}
