package works.two;
import javax.print.SimpleDoc;
import javax.sound.midi.ShortMessage;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class DateTest {
    public static void main(String [] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入日期：");
        String str = scan.nextLine().trim();
        System.out.println("输入一个数字：");
        int num = scan.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE,num);
        date = c.getTime();
        String input = sdf.format(date);
        System.out.println(num+ "天后是" +input);

    }
}
