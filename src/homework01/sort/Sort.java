package homework01.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//导入Scanner类

public class Sort {//创建排序类

    /*
     * 获取输入的模块
     * 输入是键盘的输入，通过Scanner获取字符串，输入格式例如: 1 2 4 5
     * 输出 List<Integer>
     */
    public static List<Integer> getInputList() {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner scan = new Scanner(System.in);//声明scan对象
        System.out.println("请输入要排序的数字：");//提示操作者输入
        String[] str = scan.nextLine().split(" ");//获得输入的字符,并以空格为分割
        for (int i = 0; i < str.length; i++) {
            int tmp = Integer.parseInt(str[i]);
            result.add(tmp);
        }
        return result;
    }

    /*
     * 模拟输入的模块
     * 输入 无
     * 输出 List<Integer>
     *  这样我们就不用一直输入了
     */
    public static List<Integer> mockInputList() {
        List<Integer> result = new ArrayList<>();
        result.add(7);
        result.add(3);
        result.add(23);
        result.add(5);
        result.add(12);
        result.add(1);
        return result;
    }

//    public static void BubbleSort(List<Integer> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int k = 0; k < list.size() - i - 1; k++) {
//                if (list.get(k) > list.get(k + 1)) {
//                    Sort.swap(list, k, k + 1);
//                }
//            }
//        }
//        System.out.println("冒泡法从小到大排序后：");
//        for (int j = 0; j < list.size(); j++) {
//            System.out.print(list.get(j) + "、");//循环输出排序后的数组
//        }
//        System.out.println(" ");
//    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void InsertionSort(List<Integer> list) {
        int min, t;
        for (int i = 1; i < list.size(); i++) {
            min = list.get(i);
            t = i - 1;
            while (t >= 0 && list.get(t) > min) {
                Sort.swap(list, t, t + 1);
                t--;
            }
        }
        System.out.println("插入法从小到大排序后：");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + "、");
        }
        System.out.println(" ");
    }

    public static void SelectionSort(List<Integer> list) {
        int min, t;
        for (int i = 0; i < list.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
                if (min != i) {
                    Sort.swap(list, min, j);
                }
            }
        }
        System.out.println("选择法从小到大排序后：");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + "、");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
//        List<Integer> input = Sort.mockInputList();
//        Sort.BubbleSort(input);
//        Sort.InsertionSort(input);
//        Sort.SelectionSort(input);
        // 调用继承SortMethod而来的的BubbleSort
        BubbleSort sort = new BubbleSort();
        sort.start();
    }
}
