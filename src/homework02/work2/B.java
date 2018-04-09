package homework02.work2;

public class B {

    private int min;
    private int max;
    public int countAll;

    public B(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /*
     *获取猜测结果模块
     * 输入为main模块调用传过来的a.num
     * 输出为猜测结果和猜测的总次数
     */
    public int guess () {
        int number =  (int) ((this.max - this.min) * 0.5 + this.min);
        System.out.println("B：我猜是 " + String.valueOf(number));
        return number;
    }

    public int judgeResult( short result, int currentNumber ) {
        int res = 0;
        switch ( result ){
            case A.small:  this.min = currentNumber + 1; break;
            case A.large: this.max = currentNumber - 1; break;
            case A.equal: res =1;
                break;
            default: break;
        }
        return res;
    }

    public static void output(int count) {
        System.out.println("猜测的次数为： " + count);
    }

    public static void main(String[] args) {

        final int range = 1000;
        A a = new A(range);
        B b = new B(0,range);

        int res = 0;
        while ( res == 0 ) {
            int input = b.guess();
            short result = a.gusseMe(input);;
            res = b.judgeResult(result, input);
        }
    }
}
