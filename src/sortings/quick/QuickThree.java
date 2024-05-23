package sortings.quick;

import java.util.Arrays;

public class QuickThree {

    public static void main(String[] args) {

        int[] arr = {67,10,45,32,19};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int first, int last){

        if (first >= last ){
            return;
        }

        int s = first;
        int l = last;
        int middle = first + (last - first) / 2;
        int pivot = arr[middle];
        while (s <= l){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[l] > pivot){
                l--;
            }
            if(s<=l){
                int temp = arr[s];
                arr[s] = arr[l];
                arr[l] = temp;
                l--;
                s++;
            }

        }
        quickSort(arr,first,l);
        quickSort(arr,s,last);
    }
}
