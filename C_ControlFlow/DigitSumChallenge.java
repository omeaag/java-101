package C_ControlFlow;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }
    public static int sumDigits(int number){
        if(number<0)
        {
            return -1;
        }

        int sum = 0;

        while (number > 9){
            sum += number%10;
            number /= 10;
        }

        sum += number;
//        for (int i = number; i >= 1; i /=10){
//            sum += i%10;
//        }
        return sum;
    }
}
