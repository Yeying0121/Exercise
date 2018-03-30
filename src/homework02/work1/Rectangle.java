package homework02.work1;

public class Rectangle extends PlanarGraph {
    private double height,width;
    public Rectangle(double height,double width) {
        this.height = height;
        this.width = width;
    }
    /*
     *获取长方形面积模块
     * 无输入
     * 输出为长方形的面积
     */
    public double getArea() {
        return height*width;
    }

    /*
     *获取长方形周长模块
     * 无输入
     * 输出为长方形周长
     */
    public double getPerimeter() {
        return 2*(height+width);
    }
}
