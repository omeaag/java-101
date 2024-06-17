package a_starting_java;

public class B_PrimitiveTypes {

    public static void main(String[] args) {

        System.out.println("Max int value: " + (Integer.MAX_VALUE + 1)); //overflow
        int sayi = Integer.MAX_VALUE + 1; //overflow
        int sayi1 = 2147483647 + 1; //overflow
       // int sayi2 = 2147483648; //too large error
        int sayi4 = Integer.MIN_VALUE - 1;//underflow
        int sayi3 = -2147483648 -1; //underflow

        //int sayi5 = -2147483649; //too large error
        int sayi6 = 2_147_483_647;

        System.out.println(sayi);
        System.out.println(sayi1);
        //System.out.println(sayi2);

        System.out.println("Byte value range : (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")" );
        System.out.println("Short value range : (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")" );
        System.out.println("Integer value range : (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
        System.out.println("Long value range : (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")" );
        System.out.println("Float value range : (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")" );
        System.out.println("Double value range : (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")" );
    }
}
