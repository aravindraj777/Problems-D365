package finalRev.sortings;

import java.util.Arrays;

public class QuickSortString {
    public static void main(String[] args) {
        String[] stringArr = {"B","N","A","F"};
        quickSortString(stringArr,0,stringArr.length-1);
        System.out.println(Arrays.toString(stringArr));

    }
    private static void quickSortString(String[] arr, int first, int last){

        if (first >= last){
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
            if (f <= l){
                String temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                l--;
                f++;
            }
        }
        quickSortString(arr,first,l);
        quickSortString(arr,f,last);
    }
}
