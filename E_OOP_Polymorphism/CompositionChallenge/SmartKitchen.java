package E_OOP_Polymorphism.CompositionChallenge;

public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeMaker brewMaster;

    public SmartKitchen() {
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeMaker();
    }

    public void addWater() {
        if(!brewMaster.isHasWorkToDo()){
            System.out.println("su ekleniyor...");
            brewMaster.setHasWorkToDo(true);
        }
        brewMaster.brewCoffee();
    }

    public void pourMilk() {
        if(!iceBox.isHasWorkToDo()){
            System.out.println("buzdolabı soğutuluyor...");
            iceBox.setHasWorkToDo(true);
        }
        iceBox.orderFood();
    }

    public void loadDishWasher() {
        if(!dishWasher.isHasWorkToDo()){
            System.out.println("dishwasher hazırlanıyor...");
            dishWasher.setHasWorkToDo(true);
        }
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean refrigeratorState, boolean dishWasherState, boolean coffeMakerState) {
        iceBox.setHasWorkToDo(refrigeratorState);
        dishWasher.setHasWorkToDo(dishWasherState);
        brewMaster.setHasWorkToDo(coffeMakerState);
    }


    public void doKitchenWork() {
        pourMilk();
        loadDishWasher();
        addWater();
    }
}