package d_oop_inheritance.carpet_cost_calculator;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(2.5,4.3);
        Carpet carpet = new Carpet(5.5);

        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("halının metrekaresi: " +floor.getArea()+". Halının metrekare maliyeti: "
                + carpet.getCost()+"TL'dir. Halının toplam maliyeti: "+calculator.getTotalCost()+"TL'dir");

    }
}
