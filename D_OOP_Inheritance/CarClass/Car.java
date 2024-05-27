package D_OOP_Inheritance.CarClass;

public class Car {
    private String brand = "Tesla"; //sınıfların fieldları private olmalıdır. böylelikle alanların erişebilirliğini
    // sınırlıyoruz. yani kapsülleme işlemi yapıyoruz.
    private String model = "Model X3";
    private String color = "Black";
    private int doors = 2;
    private boolean convertible = true;

    public String getBrand(){ //kapsüllediğimiz veriyi getter metotları ile geri döndürüyoruz.
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public void setBrand(String brand){
        if(brand == null) brand = "Unknown";

        String lowercaseBrand = brand.toLowerCase();
        switch (lowercaseBrand){
            case "bmw", "porsche", "tesla" -> this.brand = brand;
            default -> this.brand = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println( doors + "-doors " +
                color + " " +
                brand + " " +
                model + " " +
                (convertible ? "Convertible ": " ")
        );
    }
}
