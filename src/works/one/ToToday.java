package works.one;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

public class ToToday {
    public static Date getInputDate() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要计算的日期：");
        String line = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(line);
        return d;
    }

    // 接受输入，转成Date形式


    // 计算Date距今多少天

    // 输出多少天
    public static long date(Date d) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long thistime = d.getTime();
        Date nowDate = sdf.parse(sdf.format(new Date()));
        long nowtime = nowDate.getTime();
        long time = nowtime-thistime;
        long day = time/1000/60/60/24;
        return Math.abs(day);
    }

    public static void output(long day) {
        System.out.println("距离今天有" +day+ "天");
    }

    public static void main(String [] args)throws ParseException{
        Date input = ToToday.getInputDate();
        long day = ToToday.date(input);
        ToToday.output(day);
    }
}
