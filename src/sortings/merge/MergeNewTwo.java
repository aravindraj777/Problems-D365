package sortings.merge;

import java.util.Arrays;

public class MergeNewTwo {

    public static void main(String[] args) {
        int[] arr = {45,12,32,56,10};
        arr  = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr){

        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] combined = new int[left.length + right.length];
        int index = 0 ;
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                combined[index] = left[i];
                index++;
                i++;
            }
            else {
                combined[index] = right[j];
                index++;
                j++;
            }
        }

        while (i < left.length){
            combined[index] = left[i];
            index++;
            i++;
        }

        while (j < right.length){
            combined[index] = right[j];
            index++;
            j++;
        }
        return combined;
    }
}
