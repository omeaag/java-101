package E_OOP_Polymorphism.CompositionChallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getDishWasher().doDishes();
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
        System.out.println("----------------------");
        kitchen.doKitchenWork();
        System.out.println("----------------------");
        kitchen.setKitchenState(false,false,true);
        kitchen.doKitchenWork();

    }
}
