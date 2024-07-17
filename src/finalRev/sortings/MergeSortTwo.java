package finalRev.sortings;

import java.util.Arrays;

public class MergeSortTwo {

    public static void main(String[] args) {

        int[] arr = {33,12,45,23,10};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }
    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1){
            return arr;
        }
        int midIndex = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,midIndex);
        int[] right = Arrays.copyOfRange(arr,midIndex,arr.length);

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right){

        int index = 0;
        int i = 0;
        int j = 0;

        int[] combined = new int[left.length + right.length];

        while (i < left.length && j< right.length){
            if (left[i] < right[j]){
                combined[index] = left[i];
                i++;
                index++;
            }
            else {
                combined[index] = right[j];
                j++;
                index++;
                }
            }

        while( j < right.length){
            combined[index] = right[j];
            index++;
            j++;
        }
        while ( i < left.length){
            combined[index] = left[i];
            index++;
            i++;
        }
        return combined;
    }
}
