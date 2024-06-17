package e_oop_polymorphism.composition_bedroom;

public class Lamp {
    // write code here
    private String type;
    private boolean battery;
    private int globRating;

    public Lamp(String type,boolean battery, int globRating){
        this.type = type;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle(){
        return type;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on ");
    }
}
