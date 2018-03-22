package sort;

public class InsertionSort {//创建一个插入法排序的类
    int min,t;//声明两个实例变量，min用来存放较小的数
    public void sort(int str[]){//声明排序方法
    for(int i=1;i<str.length;i++) {//循环排序
        min=str[i];//假设当前数为最小值
        t=i-1;//取当前数前面的数字
        while(t>=0&&str[t]>min){
            str[t+1]=str[t];
            t--;
        }//若前面的数较大，则将它插到后面数字的位置
        str[t+1]=min;
    }
		System.out.println("插入法从小到大排序后：");
		for(int j=0;j<str.length;j++) {
        System.out.print(str[j]+"、");
		}
        System.out.println(" ");
    }
}
