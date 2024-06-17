package f_java_list.array;

import java.util.Arrays;

public class ReverseArray {
    // write code here
    private static void reverse(int [] arr){
        // int[] copyArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Array = "+ Arrays.toString(arr));
        for (int i = 0; i<arr.length/2;i++ ){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
