package github.arrays;

import java.util.Arrays;

public class EmployeesWhoMetTarget {

    public static void main(String[] args) {

       int[] hours = {0,1,2,3,4} ; int target = 2;
        int count = numberOfEmployeesWhoMetTarget(hours,target);
        System.out.println(count);
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

//        using normal method
        // int result = 0 ;
        // for(int i = 0 ; i < hours.length ; i++){
        //     if(hours[i] >= target){
        //         result+=1;
        //     }
        // }
        // return result;

        return (int) Arrays.stream(hours).filter(n->n >= target).count();
    }
}
