package b_expression_and_statement;

import java.util.Arrays;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){

        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }
    public static boolean hasTeen1(int num1, int num2, int num3) {
        return Arrays.asList(num1, num2, num3).stream().anyMatch(num -> isTeen(num));
    }

    public static boolean hasTeen2(int num1, int num2, int num3) {
        return Arrays.asList(num1, num2, num3).stream().anyMatch(TeenNumberChecker::isTeen);
    }

    public static boolean isTeen(int age){

        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(0,16,0));
        System.out.println(hasTeen1(16,0,0));
        System.out.println(hasTeen2(0,0,16));
    }

}
