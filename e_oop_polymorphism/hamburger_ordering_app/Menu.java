package e_oop_polymorphism.hamburger_ordering_app;

import java.util.Scanner;

public class Menu {
    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hangi içeceği istersiniz? -> (Cola, Fanta, Sprite)");
            String drink = scanner.nextLine();
            System.out.println("İçeceğin boyutu nasıl olsun? -> (S - M - L)");
            String drinkSize = scanner.nextLine();

            System.out.println("Hangi hamburger çeşidini istersiniz? -> (Meat Burger, Chicken Burger, Barbecue " +
                    "Burger)");
            String hamburger = scanner.nextLine();
            System.out.println("İçerisinde sos ister misiniz?");
            boolean sauce = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("İçerisinde marul ister misiniz?");
            boolean lettuce = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("İçerisinde peynir ister misiniz?");
            boolean cheese = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("Extra ne istersiniz? -> (Chips, Onion Rings)");
            String extra = scanner.nextLine();

            Drink drinkOrder = switch (drink.toUpperCase().charAt(0)){
                case 'F' -> new Fanta(drinkSize);
                case 'S' -> new Sprite(drinkSize);
                default -> new Cola(drinkSize);
            };

            Hamburger hamburgerOrder = switch (hamburger.toUpperCase().charAt(0)){
                case 'B' -> new BarbecueBurger(sauce, lettuce, cheese);
                case 'C' -> new ChickenBurger(sauce, lettuce, cheese);
                default -> new MeatBurger(sauce, lettuce, cheese);
            };

            ExtraTopping extraOrder = switch (extra.toUpperCase().charAt(0)){
                case 'O' -> new OnionRings();
                default -> new Chips();
            };

            FoodOrder foodOrder = new FoodOrder(drinkOrder, hamburgerOrder, extraOrder);
            foodOrder.printOrder();
        }
    }
}
