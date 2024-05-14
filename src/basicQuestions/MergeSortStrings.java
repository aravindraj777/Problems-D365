package basicQuestions;

import java.util.Arrays;

public class MergeSortStrings {

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};

        mergeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        String[] temp = new String[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    private static void mergeSortHelper(String[] arr, int left, int right, String[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right, String[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
    }
}
