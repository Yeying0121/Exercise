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
    public void getArea() {
        double area = height*width;
        System.out.println("长方形的面积为" +area);
    }

    /*
     *获取长方形周长模块
     * 无输入
     * 输出为长方形周长
     */
    public void getPerimeter() {
        double perimeter = 2*(height+width);
        System.out.println("长方形的周长为" +perimeter);
    }
}
