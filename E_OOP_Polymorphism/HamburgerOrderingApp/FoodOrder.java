package E_OOP_Polymorphism.HamburgerOrderingApp;

public class FoodOrder {
    private Drink drink;
    private Hamburger hamburger;
    private ExtraTopping extraTopping;

    public FoodOrder() {
        drink = new Cola("S");
        hamburger = new MeatBurger(true,true,true);
        extraTopping = new Chips();
    }

    public FoodOrder(Drink drink, Hamburger hamburger,ExtraTopping extraTopping) {
        this.drink = drink;
        this.hamburger = hamburger;
        this.extraTopping = extraTopping;
    }

    public void printOrder(){
        System.out.println("-------------------------");
        System.out.println("Your Drink is -> " + drink.getClass().getSimpleName() + " - Price: $" + drink.getPrice());
        System.out.println("Your Burger is -> " + hamburger.getClass().getSimpleName() + " - Price: $" + hamburger.getPrice());
        System.out.println("Your Extra is -> " + extraTopping.getClass().getSimpleName() + " - Price: $" + extraTopping.getPrice());
        double totalAmount = drink.getPrice() + hamburger.getPrice() + extraTopping.getPrice();
        System.out.println("Toplam fiyat: $" + totalAmount);
    }
}
