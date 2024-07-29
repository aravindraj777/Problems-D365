package binarySearch;

public class BinarySearchTenString {

    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E"};
        String target = "C";
        int index = search(target,arr);
        System.out.println("Value found at index "+index);
    }

    private static int search(String target , String[] arr){

        int start = 0;
        int end = arr.length;

        while (start <= end){
            int middle = (start+end)/2;
            if (target.compareTo(arr[middle]) < 0){
                end = middle - 1;
            } else if (target.compareTo(arr[middle]) > 0) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
