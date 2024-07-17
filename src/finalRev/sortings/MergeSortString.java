package finalRev.sortings;

import java.util.Arrays;

public class MergeSortString {

    public static void main(String[] args) {

        String[] arr = {"B","V","K","L"};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static String[] mergeSort(String[] arr){

        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        String[] left = Arrays.copyOfRange(arr,0,mid);
        String[] right = Arrays.copyOfRange(arr,mid,arr.length );

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }

    public static String[] merge(String[] left, String[] right){

        int i = 0;
        int j = 0;
        int index = 0;
        String[] combined = new String[left.length + right.length];
        while ( i < left.length && j < right.length){
            if (left[i].compareTo(right[j]) < 0){
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
        while (i< left.length){
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
