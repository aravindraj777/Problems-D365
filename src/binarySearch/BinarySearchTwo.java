package binarySearch;

public class BinarySearchTwo {

    public static void main(String[] args) {

        int[] arr = {2,4,5,6,7,8,9};
        int target = 9;
        int position = binarySearchHelper(target,arr);
        if (position == -1){
            System.out.println("Value not found");
        }
        else {
            System.out.println("value found at position "+ position);
        }


    };

    private static int binarySearchHelper(int target, int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

}
