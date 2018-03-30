package homework02.work2;

public class B {
    /*
     *获取猜测结果模块
     * 输入为main模块调用传过来的a.num
     * 输出为猜测结果和猜测的总次数
     */
    public static int guess ( int g){
        int countAll = 0;
        int min = 0;
        int max = 1000;
        for (int i = 0; i < 1001; i++) {
            int number = (int) ((max - min) * 0.5 + min);
            countAll += 1;
            if (number < g) {
                min = number + 1;
                System.out.println("小了！");
            } else if (number > g) {
                max = number - 1;
                System.out.println("大了！");
            } else {
                System.out.println("猜中了！");
                break;
            }
        }
        return countAll;
    }
    public static void output(int count) {
        System.out.println("猜测的次数为： " + count);
    }

    public static void main(String[] args) {
        A a = new A();
        int result = B.guess(a.num);
        B.output(result);
    }
}
