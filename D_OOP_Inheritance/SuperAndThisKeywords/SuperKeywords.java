package D_OOP_Inheritance.SuperAndThisKeywords;

public class SuperKeywords {

}
class Shape{
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x,y); //üst classın kurucu metodunu çağırır ve işlem yapar
        this.width = width; //sınıfa ait alanları tanımlar.
        this.height = height;
    }
}