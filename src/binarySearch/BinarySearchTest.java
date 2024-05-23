package binarySearch;

public class BinarySearchTest {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 2;
       search(2,arr);

    }

    public static void search(int target , int[] arr){

        int start = 0;
        int end = arr.length;

        int middle = (start +end ) / 2;

        while (start < end){
            if (target < arr[middle]){
                end = middle - 1;
            }
            else if (target > arr[middle]){
                start = middle + 1;
            }
            else {

            }
        }
    }

}
