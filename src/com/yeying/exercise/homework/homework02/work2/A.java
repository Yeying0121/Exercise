package com.yeying.exercise.homework.homework02.work2;
/*
 *获取随即数字的模块
 * 无输入
 * 无输出
 */
public class A {

    private int num ;
    final static short equal = 0, large = 1, small = 2;

    public A( int range ) {
        num = (int) (Math.random() * range );
    }

    /**
     *
     * @param input
     * @return 0 等于 1 大于 2 小于
     */
    public short gusseMe (int input) {

        if ( input > num) {
            System.out.println("A：你猜大了");
            return large;
        }
        else if (input < num) {
            System.out.println("A：你猜小了");
            return small;
        }
        else {
            System.out.println("A：你猜对了！");
            return equal;
        }
    }
}