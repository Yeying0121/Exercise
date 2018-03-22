package number;

import java.util.TreeSet;
import java.util.Set;

public class ListTest {//创建一个判断输入的数字中有无重复的类
    public int[] listtest(String[] arr) {//声明判断的方法
        Set<String> set = new TreeSet<String>();//创建一个Set集合
        for (int j = 0; j < arr.length; j++) {//将输入的数字集合去掉重复的数字
            set.add(arr[j]);
        }
        Object[] num1 = set.toArray();//将集合转换为object类型的数组
        int[] num = new int[num1.length];//声明一个int型的数组，用来存放删掉重复数字的数组，并返回
        for (int i = 0; i < num1.length; i++) {
            num[i] = Integer.parseInt(num1[i].toString());
        }//将object类型的数组转换为int类型
        return num;//返回
    }
}
