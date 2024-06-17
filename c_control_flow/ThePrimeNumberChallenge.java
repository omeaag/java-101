package c_control_flow;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        counterPrimeNumber(50);
    }
    public static void counterPrimeNumber(int number){
        int count = 0;
        for (int i = 10; count < 3 && i < number; i ++){
            if(isPrime(i)){
                System.out.println( i + " is a prime number. total prime count is " + ++count);
            }
//            if(count ==3){
//                System.out.println("Found 3 - exiting for loop");
//                break;
//            } // break ile kısıtlamak yerine if koşulu içinde kısıtlama yapabiliriz.
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor ++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
