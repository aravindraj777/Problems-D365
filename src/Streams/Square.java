package Streams;

import java.util.Arrays;
import java.util.List;

public class Square {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5);
        Double average =  list.stream()
                .map(e-> e * e)
                .filter(e -> e > 5)
                .mapToInt(e->e)
                .average()
                .getAsDouble();

        System.out.println(average);
    }
}
