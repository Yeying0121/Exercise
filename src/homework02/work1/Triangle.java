package homework02.work1;

public class Triangle extends PlanarGraph {
    private double firstline,secondline,thirdline;
    public Triangle(double firstline,double secondline,double thirdline) {
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;
    }
    public double getArea() {
        double p = (firstline+secondline+thirdline)/2;
        return Math.sqrt(p*(p-firstline)*(p-secondline)*(p-thirdline));
    }
    public double getPerimeter() {
        return firstline+secondline+thirdline;
    }
}
