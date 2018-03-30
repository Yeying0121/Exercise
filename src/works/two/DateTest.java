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
//       Date inputdate = DateTest.getInputDate();
//       int n = DateTest.getInputNum();
        String inputdate = "2018-04-01";
        int n = 2;
       String out = DateTest.getDateAfterNDays(inputdate,n);
       DateTest.output(n,out);
    }
}
