package d_oop_inheritance.cylinder_create;

public class Circle {
    // write code here
    private double radius;

    public Circle(double radius){
        this.radius = radius<0 ? 0 : radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

}