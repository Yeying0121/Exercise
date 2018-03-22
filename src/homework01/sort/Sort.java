package sort;
import java.util.Scanner;//导入Scanner类
public class Sort {//创建排序类
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//声明scan对象
        System.out.println("请输入要排序的数字：");//提示操作者输入
        String[] str = scan.nextLine().split(" ");//获得输入的字符,并以空格为分割
        int num[] = new int[str.length];//声明num数组，大小为从键盘输入字符的长度
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(String.valueOf(str[i]));
        }//将键盘输入的字符循环放入num数组
        BubbleSort bSort=new BubbleSort();//声明一个冒泡排序的对象
        bSort.sort(num);//调用冒泡排序的排序方法
        InsertionSort iSort=new InsertionSort();//同上
        iSort.sort(num);
        SelectionSort seSort=new SelectionSort();
        seSort.sort(num);
    }
}
