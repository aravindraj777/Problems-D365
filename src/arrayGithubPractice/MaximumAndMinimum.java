package arrayGithubPractice;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        int[] arr = {-1, 1, -3, 30, 20,25,-8};
        minimumAndMaximumNumberInArray(arr);
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
}
