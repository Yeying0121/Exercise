package com.yeying.exercise.assignedwork.works.two;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class DateTest {


    public static String getDateAfterNDays(String basedDay,int num) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date based = simpleDateFormat.parse(basedDay);
        calendar.setTime(based);
        calendar.add(Calendar.DATE, num);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void output(int num,String outdate) {
        System.out.println(num+ "天后是" +outdate);
    }

    public static void main(String [] args) throws Exception{
        String inputdate = "2018-04-01";
        int n = 2;
       String out = DateTest.getDateAfterNDays(inputdate,n);
       DateTest.output(n,out);
    }
}
