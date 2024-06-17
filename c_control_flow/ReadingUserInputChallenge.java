package c_control_flow;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        sumInputNumber();
    }

    public static void sumInputNumber(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 1;
        while(i <= 5){
            System.out.println("Enter number #"+i+":");
            String inputNumber = scanner.nextLine();
            try {
                int parsedInputNumber = Integer.parseInt(inputNumber);
//                int parsedInputNumber = scanner.nextInt(); //satır sonuna kadar okumaz bu yüzden yeni satıra geçmez.
                sum += parsedInputNumber;
                i++;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Value");
                //scanner.nextLine(); //scanner.nextInt() metodunun hatadan kurtulması için yeni boş satıra geçirir.
            }
        }
        System.out.println(sum);
    }
}

