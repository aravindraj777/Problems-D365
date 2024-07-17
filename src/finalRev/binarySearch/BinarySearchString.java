package finalRev.binarySearch;

public class BinarySearchString {

    public static void main(String[] args) {

        String[] str = {"A","B","C","D"};
        System.out.println(binarySearchString(str,"C"));

    }
    private static int binarySearchString(String[] arr, String target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid].compareTo(target) < 0){
                start = mid + 1;
            } else if (arr[mid].compareTo(target) > 0) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
