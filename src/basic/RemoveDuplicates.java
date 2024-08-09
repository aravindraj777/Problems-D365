package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {2,45,78,12,90,34,12,2};
        System.out.println(Arrays.toString(remove(arr)));
        System.out.println(duplicateRemove(arr));
    }

    public static int[] remove(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        int[] withOutDuplicates = new int[set.size()];
        int index = 0;
        for (int val : set){
            withOutDuplicates[index++] = val;
        }
        return withOutDuplicates;
    }

//    using streams
    private static List<Integer> duplicateRemove(int[] arr){

        return Arrays.stream(arr).boxed().distinct().toList();
    }
}
