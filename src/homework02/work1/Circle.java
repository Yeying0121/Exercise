package homework02.work1;

public class Circle extends PlanarGraph {
    private double r;
    private final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    /*
     *获取圆面积模块
     * 无输入
     * 输出为圆的面积
     */
    public double getArea() {
        return PI*r*r;
    }

    /*获取圆周长模块
    * 无输入
    * 输出为圆周长
    */
    public double getPerimeter() {
        return 2*PI*r;
    }
}
