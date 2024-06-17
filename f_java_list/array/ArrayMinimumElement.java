package f_java_list.array;

import java.util.Scanner;

public class ArrayMinimumElement {
    // write code here
    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        return number;
    }

    private static int[] readElements(int input){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[input];
        for (int i = 0; i<input ;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int len: arr){
            if(len<min){
                min = len;
            }
        }
        return min;
    }
}
