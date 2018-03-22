package sort;

public class SelectionSort {//创建一个选择排序的类
    int min, t;//声明两个实例变量
    public void sort(int str[]) {//声明排序方法
        for (int i = 0; i < str.length - 1; i++) {//循环排序
            min = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[j] < str[min]) {
                    min = j;
                }//循环找出当前循环中最小的数
                if (min != i) {
                    t = str[i];
                    str[i] = str[min];
                    str[min] = t;
                }
            }
        }
        System.out.println("选择法从小到大排序后：");
        for (int j = 0; j < str.length; j++) {
            System.out.print(str[j] + "、");
        }
        System.out.println(" ");
    }
}
