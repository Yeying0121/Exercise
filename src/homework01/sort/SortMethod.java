package homework01.sort;

import java.util.ArrayList;
import java.util.List;

public abstract class SortMethod {

    /**
     * 父类的属性
     * inputList 输入的需要排序的数组
     * outputList 输出的已排序的数组
     */
    public List<Integer> inputList;
    public List<Integer> outputList = new ArrayList<Integer>();

    /**
     * 获取输入数组的方法
     * 这里采用抽象方法，只是为了解释abstract的应用于意义
     * @return
     */
    public abstract List<Integer> getInputList ();

    /**
     * 本父类中核心的数组排序方法
     * 需要在子类中根据不同的算法重写
     */
    public void sort () {}

    /**
     * 将排序结果输出
     * 方法的具体实现，也就是body已经有了，子类中可以重写（Override），或者直接调用
     */
    public void printResult () {
        System.out.println("最后的结果" + this.outputList.toString());
    }

    /**
     * 一个Template方法，将父类中的一般流程，也就是输入-排序-输出方法固定下来
     */
    public void start () {
        this.getInputList();
        this.sort();
        this.printResult();
    }
}
