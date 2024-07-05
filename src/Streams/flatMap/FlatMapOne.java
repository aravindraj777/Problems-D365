package Streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOne {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10,20);
        List<Integer> list2 = Arrays.asList(30,40);
        List<Integer> list3 = Arrays.asList(50,60);

        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);

         List<Integer> finalResults = finalList.stream().flatMap(l-> l.stream().map(v->v+10)).collect(Collectors.toList());
        System.out.println(finalResults);

    }
}
