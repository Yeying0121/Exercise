package homework01.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort extends SortMethod{

    /**
     * 重写父类的getInputList方法
     * @return
     */
    @Override
    public List<Integer> getInputList() {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner scan = new Scanner(System.in);//声明scan对象
        System.out.println("请输入要排序的数字：");//提示操作者输入
        String[] str = scan.nextLine().split(" ");//获得输入的字符,并以空格为分割
        for (int i = 0; i < str.length; i++) {
            int tmp = Integer.parseInt(str[i]);
            result.add(tmp);
        }
        this.inputList = result;
        return null;
    }

    /**
     * 用于交换一个List对象中的某两个元素
     * @param list
     * @param i
     * @param j
     */
    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    /**
     * 重写父类中的sort方法
     * 这里是对这个不完整方法的具体实现
      */
    @Override
    public void sort () {
        List<Integer> list = this.inputList;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int k = 0; k < list.size() - i - 1; k++) {
                if (list.get(k) > list.get(k + 1)) {
                    this.swap(list, k, k + 1);
                }
            }
        }
        System.out.println("冒泡法从小到大排序后：");
        for (int j = 0; j < list.size(); j++) {
            this.outputList.add(list.get(j));
        }
    }
}
