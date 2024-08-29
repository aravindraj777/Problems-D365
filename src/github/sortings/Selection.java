package github.sortings;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {

        int[] nonSorted = {8,1,55,23,2,40};
        selectionSort(nonSorted);
        System.out.println("Sorted by selectionSort" + Arrays.toString(nonSorted));
    }

    private static void selectionSort(int[] arr){


        for (int i = 0 ; i < arr.length ; i++){
            int min = i ;
            for (int j = i+1; j < arr.length ; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
