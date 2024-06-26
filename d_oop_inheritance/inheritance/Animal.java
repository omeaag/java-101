package d_oop_inheritance.inheritance;

public class Animal {
    protected String type; //alt sınıflar ve aynı paketteki sınıflardan erişilebilir. (koşullu kapsülleme)
    private String size;
    private double weight;

    public Animal() {
        System.out.println("Animal Constructor");
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " make some kind of noise");
    }
}
