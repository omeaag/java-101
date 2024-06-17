package f_java_list.array;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i<size ;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] arr){
        int[] copyArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArray);
        for(int i = 0; i < copyArray.length /2 ; i++){
            int temp = copyArray[i];
            copyArray[i] = copyArray[copyArray.length - i - 1];
            copyArray[copyArray.length - i - 1] = temp;
        }
        return copyArray;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
}

class Main{
    public static void main(String[] args) {
        int[] newArr = SortedArray.getIntegers(5);
        System.out.println(Arrays.toString(newArr));
        newArr = SortedArray.sortIntegers(newArr);
        SortedArray.printArray(newArr);
    }
}
