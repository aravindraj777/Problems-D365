package finalRev.sortings;

import java.util.Arrays;

public class SelectionOneInt {

    public static void main(String[] args) {

        int[] arr = {34,12,20,10,67,65};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr){

        for (int i = 0 ;i < arr.length ;i++){
            int min = i;
            for (int j = i+1 ; j < arr.length ;j++){
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
