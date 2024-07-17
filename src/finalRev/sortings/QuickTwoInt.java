package finalRev.sortings;

import java.util.Arrays;

public class QuickTwoInt {

    public static void main(String[] args) {

        int[] arr = {43,11,34,10};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int first,int last){

        if (first >= last){
            return;
        }

        int f = first;
        int l = last;
        int mid = (f+l)/2;
        int pivot = arr[mid];

        while (f <= l){
            while (arr[f] < pivot){
                f++;
            }
            while (arr[l] > pivot){
                l--;
            }
            if (f<=l){
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
            }
        }
        quickSort(arr,first,l);
        quickSort(arr,f,last);
    }
}
