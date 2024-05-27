package D_OOP_Inheritance.CarClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Maserati");
        car.setModel("Taycan");
        car.setColor("White");
        car.setDoors(4);
        car.setConvertible(true);

        car.describeCar();
        System.out.println("brand: " + car.getBrand());
        System.out.println("model: " + car.getModel());

        Car focus = new Car();
        focus.setBrand("Ford");
        focus.setModel("Focus");
        focus.setDoors(4);
        focus.setColor("Blue");
        focus.setConvertible(false);

        focus.describeCar();
        System.out.println("brand: " + focus.getBrand());
        System.out.println("model: " + focus.getModel());
    }
}
