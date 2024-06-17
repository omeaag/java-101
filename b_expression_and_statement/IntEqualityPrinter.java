package b_expression_and_statement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntEqualityPrinter {
    private static Integer syncObject = 500;
    public static void main(String[] args) {
        //printEqual2(7,6,5);
        //IntegerValueCheck();
            new Thread(() -> {
                synchronized (syncObject) {
                    while (true) {
                        System.out.println("Thread 1");
                    }
                }
            }).start();

            new Thread(() -> {
                synchronized (syncObject) {
                    while (true) {
                        System.out.println("Thread 2");
                    }
                }
            }).start();

    }
    public static void printEqual(int num1, int num2, int num3){

        if(num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if(num1!=num2 && num2!=num3 && num1!=num3){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printEqual1(int num1, int num2, int num3) { //not recommended nested ternary operators
        String INVALID = "Invalid Value";
        String DIFF = "All numbers are different";
        String NEITHER = "Neither all are equal or different";
        String EQUAL = "All numbers are equal";

        System.out.println(
                (num1 < 0 || num2 < 0 || num3 < 0) ? INVALID :
                        ((num1 == num2 && num2 == num3) ? EQUAL :
                                ((num1 != num2 && num1 != num3 && num2 != num3) ? DIFF : NEITHER)));
    }


    public static void printEqual2(int num1, int num2, int num3) { //HashSet kullanımı ile çözüm
        String INVALID = "Invalid Value";
        String DIFF = "All numbers are different";
        String NEITHER = "Neither all are equal or different";
        String EQUAL = "All numbers are equal";

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println(INVALID);
        } else {
            Set<Integer> set = new HashSet<>(Arrays.asList(num1, num2, num3));
            System.out.println(set.size()==3 ? DIFF : (set.size()==2 ? NEITHER : EQUAL));
        }
    }

    public static void IntegerValueCheck(){
        Integer num1 = 500;
        Integer num2 = 500;

        System.out.println(num1 == num2);

        Integer num3 = 50;
        Integer num4 = 50;

        System.out.println(num3 == num4);
    }
}
