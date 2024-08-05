package binarySearch;

public class BinarySearchTenStringSearch {

    public static void main(String[] args) {

        String[] str = {"A","B","C","D","E","F"};
        String target = "B";
        int index = search(str,target);
        System.out.println("Value found at position - "+index);
    }

    private static int search(String[] arr, String target){

        int start = 0;
        int end = arr.length - 1;


        while (start <= end){
            int mid = (start + end) / 2;
            if (target.compareTo(arr[mid]) < 0){

                end = mid - 1;

            } else if (target.compareTo(arr[mid]) > 0) {

                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
