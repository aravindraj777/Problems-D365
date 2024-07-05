package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterDemoOne {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(67,1,26,78,98,90);
        list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        List<String> stringList = Arrays.asList("Aravind","Vishnu","Sreekanth","Aswin","Abhi","Appu");
        stringList.stream().filter(s -> s.length() > 6 && s.length()<=9).forEach(System.out::println);

    }
}
