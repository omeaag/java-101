package D_OOP_Inheritance.SuperAndThisKeywords;

public class ThisKeyword {

}

class RectangleThis{
    private int x;
    private int y;
    private int width;
    private int height;

    public RectangleThis(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public RectangleThis(int width, int height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public RectangleThis(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

class RectangleThisBetter{
    private int x;
    private int y;
    private int width;
    private int height;

    public RectangleThisBetter(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public RectangleThisBetter(int width, int height){
        this(0,0,width,height); //ana kurucuyu çağırıp değerleri yerleştirir.
    }

    public RectangleThisBetter(){
        this(0,0); //2.kurucu metodu çağırır. 2. kurucu da ana kurucu metodu çağırır ve çalıltırır.
    }
}