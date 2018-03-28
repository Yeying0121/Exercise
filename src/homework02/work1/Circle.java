package homework02.work1;

public class Circle extends PlanarGraph {
    private double r;
    private final double PI = 3.14;
    public Circle(double r) {
        this.r = r;
    }
    public double getArea() {
        return PI*r*r;
    }

    public double getPerimeter() {
        return 2*PI*r;
    }
}
