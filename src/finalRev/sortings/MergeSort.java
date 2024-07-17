package finalRev.sortings;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {33, 44, 566, 22, 10};
        int[] sortedArray = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int midIndex = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, midIndex);
        int[] right = Arrays.copyOfRange(arr, midIndex, arr.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeHelper(left, right);
    }

    public static int[] mergeHelper(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                combined[index] = left[i];
                index++;
                i++;
            } else {
                combined[index] = right[j];
                index++;
                j++;
            }
        }

        while (i < left.length) {
            combined[index] = left[i];
            index++;
            i++;
        }

        while (j < right.length) {
            combined[index] = right[j];
            index++;
            j++;
        }

        return combined;
    }
}
