package binarySearch;

public class BinarySearchThree {

    public static void main(String[] args) {

        int[] arr = {3,6,9,10,12,23};
        int target = 9;
        int position = binarySearchHelper(9,arr);
        System.out.println("Value found at position "+ position);

    };

    private static int binarySearchHelper(int target, int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
