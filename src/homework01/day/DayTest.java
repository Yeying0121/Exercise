package day;
import java.util.Scanner;
public class DayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//调用Scanner类
        System.out.println("请输入年、月、日：");
        String str[] = scan.nextLine().split("、");//取得键盘输入，并以、为分割符
        if (str.length != 3) {//判断输入的格式是否为年、月、日
            System.err.println("您的输入有误！");
        } else {
            Day day1 = new Day();//声明day对象
            day1.day(str);//调用day方法
        }
    }
}
