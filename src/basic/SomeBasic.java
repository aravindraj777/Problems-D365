package basic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SomeBasic {

    public static void main(String[] args) {

        int[] arr = {2,5,3,7,9,10,1,45};
        largestValue(arr);
        iterativeMax(arr);
        reverseStream(arr);
        iterativeReverse(arr);
    }

    private static void largestValue(int[] arr){

        OptionalInt maxValue = Arrays.stream(arr).max();
        if (maxValue.isPresent()){
            System.out.println("Max value "+ maxValue);
        }
        else {
            System.out.println("No value present in array");
        }

    }

    private static void iterativeMax(int[] arr){

        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Max value = "+ max);
    }

//    Reverse the array
    private static void reverseStream(int[] arr){

       int[] reversedArray = IntStream.range(0,arr.length).map(
               i -> arr[arr.length - i - 1]
       ).toArray();

        System.out.println("Reversed array" + Arrays.toString(reversedArray));
    }

    private static void iterativeReverse(int[] arr){

        int n = arr.length;

        for (int i = 0 ;i< arr.length/2 ;i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n-i-1] = temp;
        }
        System.out.println("Iterative Reversed Array  =  " + Arrays.toString(arr));
    }
}
