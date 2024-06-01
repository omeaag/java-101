package E_OOP_Polymorphism.PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda GTR 90s");
        runRace(car);

        Car gasCar = new GasPoweredCar("Mustang 69s",16.8,8);
        runRace(gasCar);

        Car tesla = new ElectricCar("Tesla Model X",15.6,75);
        runRace(tesla);

        Car hybridCar = new HybridCar("Ferrari T90s",15,8,55);
        runRace(hybridCar);
    }

    public static void runRace(Car car){
        System.out.println("-----------------------------------------------------");
        car.startEngine();
        car.drive();
    }
}
