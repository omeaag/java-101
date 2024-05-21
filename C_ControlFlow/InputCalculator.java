package C_ControlFlow;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        //inputThenPrintSumAndAverage2();
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;


        while(true){
            System.out.println("enter a number: ");
            String inputNumber = scanner.nextLine();

            try {
                int parseInput = Integer.parseInt(inputNumber);
                sum += parseInput;
                count++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        average =  Math.round (count > 0 ?(double) sum/count : sum/1);
        System.out.println("SUM = " + sum + " AVG = "+ average);
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage1(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;


        while(true){
            System.out.println("enter a number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                sum += scanner.nextInt();
                count++;
            }else {
                break;
            }
        }
        average =  Math.round (count > 0 ?(double) sum/count : sum/1);
        System.out.println("SUM = " + sum + " AVG = "+ average);
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage2(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while(scanner.hasNextInt()){
                sum += scanner.nextInt();
                count++;
        }
        average =  Math.round (count > 0 ?(double) sum/count : sum/1);
        System.out.println("SUM = " + sum + " AVG = "+ average);
        scanner.close();
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(width<=0||height<=0||areaPerBucket<=0||extraBucket<0){
            return -1;
        }
        return (int) Math.ceil(width*height/areaPerBucket) - extraBucket;
    }
}
