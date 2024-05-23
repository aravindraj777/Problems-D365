package sortings.quick;

import java.util.Arrays;

public class QuickFour {

    public static void main(String[] args) {

        int[] arr = {45,12,32,19,23};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr,int first, int last){

        if (first >= last){
            return;
        }

        int f = first;
        int l = last;
        int middle = first + (last-first) / 2 ;
        int pivot = arr[middle];

        while (f <= l){
            while (arr[f] < pivot){
                f++;
            }
            while (arr[l] > pivot){
                l--;
            }
            if(f<=l){
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                f++;
                l--;
            }
        }
        quickSort(arr,first,l);
        quickSort(arr, f, last);
    }
}
