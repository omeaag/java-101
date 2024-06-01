package E_OOP_Polymorphism.HamburgerOrderingApp;

public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Cola extends Drink{

    public Cola(String size) {
        super("Cola", size,
           switch (size.toUpperCase().charAt(0)){
            case 'M' -> 4;
            case 'L' -> 6;
            default -> 2;
           });
    }
}

class Fanta extends Drink{
    private String size;
    private double price;

    public Fanta(String size) {
        super("Fanta", size,
                switch (size.toUpperCase().charAt(0)){
                    case 'M' -> 3;
                    case 'L' -> 5;
                    default -> 2;
                });
    }
}

class Sprite extends Drink{
    private String size;
    private double price;

    public Sprite(String size) {
        super("Sprite", size,
                switch (size.toUpperCase().charAt(0)){
                    case 'M' -> 5;
                    case 'L' -> 7;
                    default -> 3;
                });
    }
}
