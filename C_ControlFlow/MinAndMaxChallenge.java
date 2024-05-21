package C_ControlFlow;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        minAndMaxNumber();
    }
    public static void minAndMaxNumber(){
        Scanner scanner = new Scanner(System.in);

        double min=0;
        double max=0;

        while (true){
            System.out.println("bir sayı giriniz: ");
            String inputNumber = scanner.nextLine();
            try {
                double parsedInputNumber = Double.parseDouble(inputNumber);
                if(min==0 && max == 0){
                    min=parsedInputNumber;
                    max=parsedInputNumber;
                }
                if(parsedInputNumber<min){
                    min = parsedInputNumber;
                }
                if(parsedInputNumber>max){
                    max=parsedInputNumber;
                }
            }catch (NumberFormatException nfe){
                break;
            }
        }
        System.out.println("min deger: " +min+ " - max deger: "+max);
    }
}
