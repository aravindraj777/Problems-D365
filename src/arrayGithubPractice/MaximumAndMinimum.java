package arrayGithubPractice;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        int[] arr = {-1, 1, -3, 30, 20,25,-8};
        minimumAndMaximumNumberInArray(arr);
        pairWiseComparison(arr);
    }

    public static void minimumAndMaximumNumberInArray(int[] arr){

        int min = arr[0];
        int max = arr[0];

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Largest : "+ max);
        System.out.println("smallest : "+min);
    }

    public static void pairWiseComparison(int[] arr){

        int min = arr[0];
        int max = arr[0];
        for (int i = 0 ; i < arr.length-1 ; i+=2){
            int localMin; int localMax;
            if (arr[i] < arr[i+1]){
                localMin = arr[i];
                localMax = arr[i+1];
            }
            else{
                localMin = arr[i+1];
                localMax = arr[i];
            }

            if (localMin < min) min = localMin;
            if (localMax > max) max = localMax;
        }

        if (arr.length % 2 != 0) {
            int last = arr[arr.length - 1];
            if (last < min) min = last;
            if (last > max) max = last;
        }


        System.out.println("Max "+max);
        System.out.println("Min "+min);

    }
}
