package works.one;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

public class ToToday {

    public static void main(String [] args)throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要计算的日期：");
        String line = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(line);
        long thistime = d.getTime();
        long nowtime = System.currentTimeMillis();
        long time = nowtime-thistime;
        long day = time/1000/60/60/24;
        System.out.println("距离今天有" +day+ "天");
    }
}
