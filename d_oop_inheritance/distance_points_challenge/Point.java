package d_oop_inheritance.distance_points_challenge;

public class Point {
    // write code here

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int sqrt = (getX() * getX()) + (getY() * getY());
        return (double) Math.sqrt(sqrt);
    }

    public double distance(int x, int y) {
        int sqrt = (getX() - x) * (getX() - x) + (getY() - y) * (getY() - y);
        return (double) Math.sqrt(sqrt);
    }

    public double distance(Point point) {
        int sqrt = (getX() - point.getX()) * (getX() - point.getX()) + (getY() - point.getY()) * (getY() - point.getY());
        return (double) Math.sqrt(sqrt);
    }
}
