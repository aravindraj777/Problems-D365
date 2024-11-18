package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovePrime {

    public static void main(String[] args) {

        int[] arr = {2,4,5,1,3,6,10};
        System.out.println(Arrays.toString(nonPrime(arr)));


    }

    private static  int[] nonPrime(int[] prime){

        Set<Integer> nonPrime = new HashSet<>();
       for (int i = 2 ;i < prime.length ;i++){
           if (prime[i] % i != 0){
               nonPrime.add(prime[i]);
           }
           else {
               continue;
           }
       }
       return nonPrime.stream().mapToInt(Integer::intValue).toArray();
    }
}
