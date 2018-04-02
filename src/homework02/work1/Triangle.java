package homework02.work1;

public class Triangle extends PlanarGraph {
    private double firstline,secondline,thirdline;

    public Triangle(double firstline,double secondline,double thirdline) throws MyException {

        if ( !(firstline + secondline > thirdline && firstline - secondline < thirdline)) {
            throw new MyException("input is wrong");
        }
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;

    }

    /*
     *获取三角形面积模块
     * 无输入
     * 输出为三角形面积
     */
    public void getArea() {
        double p = (firstline+secondline+thirdline)/2;
        double area = Math.sqrt(p*(p-firstline)*(p-secondline)*(p-thirdline));
        System.out.println("三角形面积为" +area);
    }

    /*
     *获取三角形周长模块
     * 无输入
     * 输出为三角形周长
     */
    public void getPerimeter() {
        double perimeter = firstline+secondline+thirdline;
        System.out.println("三角形的周长为" +perimeter);
    }
}
