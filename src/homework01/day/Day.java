package day;

public class Day {
    int [] a={0,31,29,31,30,31,30,31,31,30,31,30,31};//创建a数组存放闰年月份天数，数组下标对应月份
    int [] b={0,31,28,31,30,31,30,31,31,30,31,30,31};//创建b数组存放平年月份天数，数组下标对应月份
    public void day(String [] str) {//声明判断星期几的方法
        int year = Integer.parseInt(String.valueOf(str[0]));//将输入的年份转换为int类型并赋值给year变量
        int month = Integer.parseInt(String.valueOf(str[1]));//将输入的月份转换为int类型并赋值给month变量
        int day = Integer.parseInt(String.valueOf(str[2]));//将输入的日期转换为int类型并赋值给day变量
        if (month > 12 || month <= 0) {//判断月份的输入是否正确
            System.out.println("您的输入有误！");
            System.out.println(0);
        } else {
            int a1 = (year - 1968 - 1) / 4;//计算在yaer和1970年之间有几个闰年
            int b1 = (year - 1970 - 1) * 365 + a1;//计算在1970年到当前输入年份的1月1日之间共有多少天
            if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {//判断是否为闰年
                int day1 = 0;
                for (int i = 0; i < month; i++) {
                    if(day>a[i]||day<=0){
                        System.out.println("您的输入有误！");
                        System.out.println(0);
                    }
                    day1 += a[i];//计算当前输入月份之前的天数
                }
                int week = (b1 + day1 + day + 4) % 7;//因为1970年1月1日为星期四，所以加上4
                if (week == 0) {
                    System.out.println("这天是星期天！");
                } else {
                    System.out.println(year + "年的" + month + "月的" + day + "日是星期" + week);
                }
            } else {
                int day1 = 0;
                for (int i = 0; i < month; i++) {
                    day1 += b[i];
                }
                int week = (b1 + day1 + day + 4) % 7;
                if (week == 0) {
                    System.out.println("这天是星期天！");
                } else {
                    System.out.println(year + "年" + month + "月" + day + "日是星期" + week);//同上，平年的判断方法
                }
            }
        }
    }
}
