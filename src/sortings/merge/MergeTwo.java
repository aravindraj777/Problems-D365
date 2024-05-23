package sortings.merge;

import java.util.Arrays;

public class MergeTwo {

    public static int[] mergeSort(int[] arr){

        if(arr.length == 1)
        {
            return arr;
        }
        int midIndex = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] arr, int[] brr){
        int[] combined = new int[arr.length + brr.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                combined[index] = arr[i];
                index++;
                i++;
            }
            else {
                combined[index] = brr[j];
                index++;
                j++;
            }
        }
        while (i < arr.length){
            combined[index]  =arr[i];
            index++;
            i++;
        }
        while (j < brr.length){
            combined[index] = brr[j];
            index++;
            j++;
        }
        return combined;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,12,10,9,1};
        int[] sortedArray = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}























