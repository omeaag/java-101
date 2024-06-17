package f_java_list.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
//        int[] firstArray = getRandomArray(5);
//        System.out.println("First Array -> " + Arrays.toString(firstArray));
//        Arrays.sort(firstArray);
//        System.out.println("Sorted First Array -> " + Arrays.toString(firstArray));
//        int[] secondArray = sortBigToSmall(firstArray);
//        System.out.println("Big to Small Sorted First Array -> " + Arrays.toString(secondArray));
//        System.out.println("First Array Last Version -> " + Arrays.toString(firstArray));
//        int[] BigToSmallFirstArray = sortBigToSmall(firstArray);
//        System.out.println("Big to Small First Array -> " + Arrays.toString(BigToSmallFirstArray));

        int[] secondUnsortedArray = getRandomArray(3);
        System.out.println("Second Unsorted Array -> " + Arrays.toString(secondUnsortedArray));

        int[] secondSortedArray = sortInteger(secondUnsortedArray);
        System.out.println("Second Sorted Array -> " + Arrays.toString(secondSortedArray));
    }

    public static int[] sortInteger(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

    public static int[] sortBigToSmall(int[] array){
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        for(int i = 0; i < copyArray.length /2 ; i++){
            int temp = copyArray[i];
            copyArray[i] = copyArray[copyArray.length - i - 1];
            copyArray[copyArray.length - i - 1] = temp;
        }
        return copyArray;
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}

