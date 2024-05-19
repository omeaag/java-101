package C_ControlFlow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(15,24,84));
    }
    public static boolean hasSameLastDigit(int num1, int num2,int num3){
        if(!isValid(num1)||!isValid(num2)||!isValid(num3)){
            return false;
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(num1%10, num2%10, num3%10));
        return set.size() != 3;
    }

    public static boolean isValid(int number){
        return number>=10 && number<=1000;
    }
}
