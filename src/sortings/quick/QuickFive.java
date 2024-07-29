package sortings.quick;

import java.util.Arrays;

public class QuickFive {

    public static void main(String[] args) {
        int[] arr = {32,12,45,90,12,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int first, int last){

        if (first >= last){
            return ;
        }

        int middle = (first + last) /2;
        int f = first;
        int l = last;

        int pivot = arr[middle];
        while (f <= l){
            while (arr[f] < pivot){
                f++;
            }
            while (arr[l] > pivot){
                l--;
            }
            if (f <= l){
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                f++;
                l--;
            }
        }
        quickSort(arr,first,l);
        quickSort(arr,f,last);
    }
}
