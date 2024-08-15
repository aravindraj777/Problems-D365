package github.arrays;

public class RemoveDuplicates {

//    26. Remove Duplicates from Sorted Array
    public static void main(String[] args) {

        int[] nums = {1,1,2};
         int count  = removeDuplicates(nums);
        System.out.println(count);
    }

    public static int removeDuplicates(int[] nums) {

        int i = 0 ;
        for (int j = 1 ; j < nums.length ; j++){
            if (nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }

        }
        return (i+1);
    }
}
