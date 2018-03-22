package number;
import java.util.*;
public class NumberTest {
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入要组合的数字（提示：输入的数字大小应在0~9之间）：");
        String []str=scan.nextLine().split(" ");//获得输入的字符,并以空格为分割
        ListTest list=new ListTest();
        int []num=list.listtest(str);//调用判断输入中是否有重复数字的方法
        /*for(int i=0;i<str.length;i++){
            num[i]=Integer.parseInt(String.valueOf(str[i]));
        }*/
        Number numtest=new Number();
        numtest.number(num);//调用组合方法
    }
}
