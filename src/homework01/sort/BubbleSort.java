package sort;

public class BubbleSort {//创建一个冒泡排序的类
    int temp;//声明一个实例变量，用来做排序时的中间桥梁
    public void sort(int arr[]) {//声明排序方法
        for (int i = 0; i < arr.length-1; i++) {//外部循环
            for (int k = 0; k < arr.length - i-1; k++) {//内部循环
                if (arr[k] > arr[k+1]) {
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }//循环比较相邻两个数的大小，将较小的数字往前排
            }
        }
        System.out.println("冒泡法从小到大排序后：");
        for (int j = 0; j <arr.length; j++) {
            System.out.print(arr[j] + "、");//循环输出排序后的数组
        }
        System.out.println(" ");
    }
}
