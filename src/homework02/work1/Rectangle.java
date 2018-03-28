package homework02.work1;

public class Rectangle extends PlanarGraph {
    private double height,width;
    public Rectangle(double height,double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return height*width;
    }
    public double getPerimeter() {
        return 2*(height+width);
    }
}
