package finalRev.sortings;

import java.util.Arrays;

public class QuickSortStringTwo {

    public static void main(String[] args) {
        String[] arr = {"H","Z","R","T"};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("faf");
        System.out.println(99);

    }

    private static void quickSort(String[] arr,int first,int last){

        if(first >= last){
            return;
        }
        int f = first;
        int l = last;
        int mid = (f+l)/2;
        String pivot = arr[mid];

        while (f <= l){
            while (arr[f].compareTo(pivot) < 0){
                f++;
            }
            while (arr[l].compareTo(pivot) > 0){
                l--;
            }
            if (f<=l){
                String temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
            }
        }
        quickSort(arr,first,l);
        quickSort(arr,f,last);
    }
}
