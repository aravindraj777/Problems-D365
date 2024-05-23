package sortings.merge;

import java.util.Arrays;

public class MergeThree {

    public static int[] mergeSort(int[] arr){

        if (arr.length == 0){
            return arr;
        }
        int midIndex = arr.length / 2;
        int[] right = Arrays.copyOfRange(arr,0,midIndex);
        int[] left  = Arrays.copyOfRange(arr,midIndex,arr.length);
        return merge(left,right);
    }

    public static int[] merge(int[] right,int[] left){

        int[] combined = new int[right.length + left.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
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
        while(i < left.length){
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

    public static void main(String[] args) {

        int[] arr = {7,1,89,20,12,32};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
