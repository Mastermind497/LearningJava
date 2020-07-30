package Classes;

public class Circle {

    private double radius;
    private Point center;

    public Circle(double radius, int centerX, int centerY) {
        this.radius = radius;
        this.center = new Point(centerX, centerY);
    }

    public Circle(double radius, Point center) {
        this. radius= radius;
        this.center = center;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point(0, 0);
    }

    public Circle() {
        this(1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    //    static final double pi = Math.PI;
//
//    private double radius;
//    private Point center;
//
//    public Circle(double radius, int x, int y) {
//        this.radius = radius;
//        this.center = new Point(x, y);
//    }
//
//    public Circle(double radius, Point p) {
//        this.radius = radius;
//        this.center = p;
//    }
//
//    public Circle(double radius) {
//
//    }
}
