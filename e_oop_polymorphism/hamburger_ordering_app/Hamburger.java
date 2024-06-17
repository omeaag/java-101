package e_oop_polymorphism.hamburger_ordering_app;

public class Hamburger {
    private String type;
    private double price;
    private boolean haveSauce;
    private boolean haveLettuce;
    private boolean haveCheese;

    public Hamburger(String type, double price) {
        this(type,price,false,false,false);
    }

    public Hamburger(String type, double price,boolean haveSauce,boolean haveLettuce,boolean haveCheese) {
        this.type = type;
        this.price = price;
        this.haveSauce = haveSauce;
        this.haveLettuce = haveLettuce;
        this.haveCheese = haveCheese;
    }

    public double getPrice() {
        return price;
    }
}

class MeatBurger extends Hamburger{

    public MeatBurger(boolean haveSauce,boolean haveLettuce,boolean haveCheese) {
        super("Meat", 12, haveSauce, haveLettuce, haveCheese);
    }
}

class ChickenBurger extends Hamburger{

    public ChickenBurger(boolean haveSauce,boolean haveLettuce,boolean haveCheese) {
        super("Chicken", 9.75, haveSauce, haveLettuce, haveCheese);
    }
}

class BarbecueBurger extends Hamburger{

    public BarbecueBurger(boolean haveSauce,boolean haveLettuce,boolean haveCheese) {
        super("Barbecue", 13.5, haveSauce, haveLettuce, haveCheese);
    }
}


