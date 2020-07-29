package Classes;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public double distanceTo(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public Point midpoint(Point p) {
//        int xPart = (this.x + p.getX()) / 2;
//        int yPart = (this.y + p.getY()) / 2;
//
//        return new Point(xPart, yPart);
        return midpoint(p.getX(), p.getY());
    }

    public Point midpoint(int x, int y) {
        int xPart = (this.x + x) / 2;
        int yPart = (this.y + y) / 2;

        return new Point(xPart, yPart);
    }

    public String toString() {
        return "(" + x + ", " + y +")";
    }
}
