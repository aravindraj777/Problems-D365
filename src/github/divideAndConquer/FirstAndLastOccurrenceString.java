package github.divideAndConquer;

public class FirstAndLastOccurrenceString {

    public static void main(String[] args) {
        String[] arr = {"a","b","b","c","c","c","c","c","c","c","c","d","d"};
        String target = "c";
        int occurrence = findFirstOccurrence(arr,target);
        System.out.println(occurrence);
    }
    private static int findFirstOccurrence(String[] arr, String target){

        int start = 0 ;
        int end = arr.length - 1;

        int result = 0;
        while (start <= end){
            int mid = (start + end) / 2;

            if (arr[mid].equals(target)){

                result = mid;
                end = mid - 1;
            }
            else if (arr[mid].compareTo(target) < 0){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }
}
