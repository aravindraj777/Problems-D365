package sortings.merge;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

public class MergeSix {

    public static void main(String[] args) {
        int[] arr = {5,21,12,23,5};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] mergeSort(int[] arr){

        if (arr.length == 1){
            return arr;
        }
        int midIndex = arr.length /2 ;
        int[] left = Arrays.copyOfRange(arr,0,midIndex);
        int[] right = Arrays.copyOfRange(arr,midIndex,arr.length);
        left = mergeSort(left);  // Sort the left half
        right = mergeSort(right);
        return mergeHelper(left,right);
    }

    public static int[] mergeHelper(int[] arr , int[] brr){

        int[] combined = new int[arr.length + brr.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr.length && j< brr.length){
            if (arr[i] < brr[j]){
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
        while (i< arr.length){
            combined[index] = arr[i];
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
}
