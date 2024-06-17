package c_control_flow;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime3(217));
    }
    public static int getLargestPrime(int number){
        if(number<2){
            return -1;
        }

        int prime = -1;

        for (int i=2; i<=number; i++){
            if(number%i == 0){
                boolean isPrime = true;

                for (int j=2; j<=i/2; j++){
                    if (i%j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    prime = i;
                }
            }
        }
        return prime;
    }
    public static int getLargestPrime1(int number){
        if(number<2){
            return -1;
        }

        int i = 2;
        while(i<number){
            if(number%i == 0){
                number /= i;
                continue;
            }
            i++;
        }
        return number;
    }
    public static int getLargestPrime3(int number){
        if(number<2){
            return -1;
        }

        for(int i = number/2; i>1; i--){
            if(number%i == 0){
                number = i;
            }
        }
        return number;
    }

}
