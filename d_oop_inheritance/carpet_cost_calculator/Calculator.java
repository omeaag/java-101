package d_oop_inheritance.carpet_cost_calculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
