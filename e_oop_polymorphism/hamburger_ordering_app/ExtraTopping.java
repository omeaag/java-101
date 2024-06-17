package e_oop_polymorphism.hamburger_ordering_app;

public class ExtraTopping {
    private String type;
    private double price;

    public ExtraTopping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Chips extends ExtraTopping{

    public Chips() {
        super("Chips", 3);
    }
}

class OnionRings extends ExtraTopping{

    public OnionRings() {
        super("Onion Rings", 3.5);
    }
}



