package E_OOP_Polymorphism.MealOrderChallenge;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("coke","drink",1.25);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addToppings("BACON","SALAMI","SOS");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","SOS","DOMATES");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","coke","chili");
        deluxeMeal.addBurgerToppings("AVACADO","LETTUCE","BACON","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("LARGE");
        deluxeMeal.printItemizedList();




    }
}
