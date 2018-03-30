package homework02.work1;

public class Triangle extends PlanarGraph {
    private double firstline,secondline,thirdline;
    public Triangle(double firstline,double secondline,double thirdline) {
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;
    }

    /*
     *获取三角形面积模块
     * 无输入
     * 输出为三角形面积
     */
    public double getArea() {
        double p = (firstline+secondline+thirdline)/2;
        return Math.sqrt(p*(p-firstline)*(p-secondline)*(p-thirdline));
    }

    /*
     *获取三角形周长模块
     * 无输入
     * 输出为三角形周长
     */
    public double getPerimeter() {
        return firstline+secondline+thirdline;
    }
}
