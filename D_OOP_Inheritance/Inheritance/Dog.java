package D_OOP_Inheritance.Inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("kangal","orta",95);
    }

    public Dog(String type,double weight){
        this(type, weight,"yatık","kıvrık");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small" : (weight<35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed=="slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Hav! Hav! ");
    }
    private void run(){
        System.out.print(type + " Running ");
    }
    private void walk(){
        System.out.print(type + " Walking ");
    }
    private void wagTail(){
        System.out.print("Tail Wagging ");
    }

}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
