package github.sortings;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] nonSorted = {3,1,56,23,10,30};
        bubbleSort(nonSorted);
        System.out.println("Sorted array : "+ Arrays.toString(nonSorted));
    }

    private static void bubbleSort(int[] arr){

        int temp;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length  ; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
