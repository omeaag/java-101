package E_OOP_Polymorphism.MealOrderChallenge;

public class DeluxeBurger extends Burger{

    private Item delux1;
    private Item delux2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4,String extra5) {
        super.addToppings(extra1, extra2, extra3);
        delux1 = new Item(extra4,"TOPPING",0);
        delux2 = new Item(extra5,"TOPPING",0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(delux1 != null){
            delux1.printItem();
        }
        if(delux2 != null){
            delux2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0.0;
    }

}
