package homework02.work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanarGraphTest {
    /*
     * 获取输入的模块
     * 输入是键盘的输入，通过Scanner获取字符串，输入格式例如: 1 2 4 5
     * 输出 List<Integer>
     */
    public static List<Integer> getInputList() {
        List<Integer> result = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入圆半径（或三角形边长、长方形的长和宽）：");
        String[] str = scan.nextLine().split(" ");//获得输入的字符,并以空格为分割
        for (int i = 0; i < str.length; i++) {
            int tmp = Integer.parseInt(str[i]);
            result.add(tmp);
        }
        return result;
    }

    public static void main(String [] args) {

        try{
//        PlanarGraph circle = new Circle(3.5);
//        PlanarGraph rect = new Rectangle(3,7);
            PlanarGraph tri = new Triangle(3,4,100);
            tri.getArea();
        } catch (MyException e){
            e.printStackTrace();
        } catch (RuntimeException e){
            // TODO
        } catch (Exception e){
            // TODO
        } finally {
            System.out.println("hello, i am living");
        }
    }
}
