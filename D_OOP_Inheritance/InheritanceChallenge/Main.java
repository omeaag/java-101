package D_OOP_Inheritance.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee omer = new Employee("ömer can","26/02/1999","01/08/2024");

        System.out.println(omer);
        System.out.println("Age = " + omer.getAge());
        System.out.println("Pay = "+ omer.collectPay());

        System.out.println("------------------------------------------");
        SalariedEmployee kerim = new SalariedEmployee("kerim","02/04/1999",
                "06/11/2025",240000);
        System.out.println(kerim);
        System.out.println("Kerim'in maaşı: " + kerim.collectPay()+"TL");

        kerim.retire();
        System.out.println(kerim);
        System.out.println("Kerim'in maaşı: " + kerim.collectPay()+"TL");
    }
}
