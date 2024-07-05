package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2,4,3,2,6,90,45,74,32);
        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<Integer> reverseOrder = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);

        List<String> list2 = Arrays.asList("A","G","K","X","W","U");
        List<String> stringList = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(stringList);

        List<String> reverseStringList = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseStringList);
    }
}
