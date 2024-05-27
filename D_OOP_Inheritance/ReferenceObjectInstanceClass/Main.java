package D_OOP_Inheritance.ReferenceObjectInstanceClass;

public class Main {
    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse; //iki referans da hafızada oluşturulmuş aynı House nesnesine işaret ediyor.

        System.out.println(blueHouse.getColor()); //blue
        System.out.println(anotherHouse.getColor()); //blue

        System.out.println("----------------------------------------------------");

        anotherHouse.setColor("yellow"); //another house ile renk değişimi yaotık ikisi de aynı nesneyi gösterdiği
        // için değişiklik ikisinde de geçerli olacak.

        System.out.println(blueHouse.getColor()); //yellow
        System.out.println(anotherHouse.getColor()); //yellow

        System.out.println("----------------------------------------------------");

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); //yellow
        System.out.println(greenHouse.getColor()); //green
        System.out.println(anotherHouse.getColor()); //green


    }
}
