package binarySearch;

public class BinarySearchNine {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int index = search(arr,target);
        System.out.println("Value found at position "+ index);
    }

    public static int search(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = (start + end )/2;

            if (arr[middle] < target){
                start = middle + 1;
            } else if (arr[middle] > target) {
                end  = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
