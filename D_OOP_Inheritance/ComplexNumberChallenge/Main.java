package D_OOP_Inheritance.ComplexNumberChallenge;

public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2,5);
        ComplexNumber number2 = new ComplexNumber(3,4);
        number1.add(number2);

        System.out.println(number1.getReal());
        System.out.println(number1.getImaginary());
    }
}
