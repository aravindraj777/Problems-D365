package arrayGithubPractice;

public class FindMissingInArray {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1,2};
        int missing = findMissingNum(nums);
        System.out.println("Missing number "+missing);
    }

    public static int findMissingNum(int[] arr){

        int n = arr.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        int sum = 0;
        for(int i=0; i< arr.length ;i++){
            sum+=arr[i];
        }

        return  expectedSum - sum;

    }
}
