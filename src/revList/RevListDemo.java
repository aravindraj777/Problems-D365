package revList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RevListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(23);
        list.add(99);
        list.add(33);

        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> removedList = list.stream().filter(num->num!= 23).collect(Collectors.toList());
        System.out.println(removedList);
    }
}
