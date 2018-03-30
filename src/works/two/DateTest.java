package works.two;
import javax.print.SimpleDoc;
import javax.sound.midi.ShortMessage;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class DateTest {
    public static Date getInputDate() throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入日期：");
        String str = scan.nextLine().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        return date;
    }

    public static int getInputNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int num = scan.nextInt();
        return num;

    }

    public static String date(Date d,int num){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        c.setTime(d);
        c.add(Calendar.DATE,num);
        d = c.getTime();
        String output = sdf.format(d);
        return output;

    }

    public static void output(int num,String outdate) {
        System.out.println(num+ "天后是" +outdate);
    }
    public static void main(String [] args) throws Exception{
       Date inputdate = DateTest.getInputDate();
       int n = DateTest.getInputNum();
       String out = DateTest.date(inputdate,n);
       DateTest.output(n,out);
    }
}
