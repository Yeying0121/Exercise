package works.one;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

public class ToToday {

    public static void main(String [] args)throws ParseException {
        String line = "2018-04-01";
        System.out.print(line + "距离今天有");
        System.out.print(ToToday.nextFolloupTimeFromnow(line));
        System.out.print("天");
    }

    public static int nextFolloupTimeFromnow (String day) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDay = sdf.parse(day);
        Date nowDate = sdf.parse(sdf.format(new Date()));
        long time = inputDay.getTime() - nowDate.getTime();
        return (int)(time/1000/60/60/24);
    }

}
