package Classes;

public class Circle {
    static final double pi = Math.PI;

    private double radius;
    private Point center;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public Circle(double radius, Point p) {
        this.radius = radius;
        this.center = p;
    }

    public Circle(double radius) {

    }
}
