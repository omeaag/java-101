package c_control_flow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221221));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;

        for (int i = number; i != 0; i /= 10){
            reverse = (reverse * 10) + i % 10;
        }
        return reverse ==  number;
    }

    // int copyNumber = number;
    // int divide = 0;
    // while(copyNumber > 9 || copyNumber * -1 > 9){
    //     copyNumber /= 10;
    //     divide ++;
    // }
    // copyNumber = number;

    // int digitValue;
    // int reverseNumber = 0;

    // while(divide >= 0){
    //     int lastDigit = copyNumber % 10;
    //     copyNumber /= 10;
    //     digitValue = lastDigit * (int) Math.pow(10, divide--);
    //     reverseNumber += digitValue;
    // }
    // return reverseNumber == number;
    
}
