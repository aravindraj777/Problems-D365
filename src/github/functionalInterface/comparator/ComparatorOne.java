package comparator;

import java.util.Arrays;

public class ComparatorOne {


    public static void main(String[] args) {

        Integer[] arr = {34,45,6,78,21,90};
        Arrays.sort(arr,(a,b)-> b-a);

        for (int v: arr){
            System.out.println(v);
        }
    }
}
