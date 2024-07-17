package finalRev.sortings;

import java.util.Arrays;

public class QuickOneInt {


    public static void main(String[] args) {

        int[] arr = {21,1,45,23,2};

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("oooo");
    }

    private static void quickSort(int[] arr, int first, int last){

        if (first >= last){
            return;
        }

        int f = first;
        int l = last;
        int mid = (f+l)/2;
        int pivot = arr[mid];

        while (f <= l ){
            while (arr[f] < pivot ){
                f++;
            }
            while (arr[l] > pivot){
                l--;
            }
            if (f<=l){
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                l--;
                f++;
            }
        }
        quickSort(arr,first,l);
        quickSort(arr,f,last);

    }
}
