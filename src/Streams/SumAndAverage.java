package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumAndAverage {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,6,7);
        Optional<Integer> sum = list.stream().reduce((a, b)-> a+b);
        System.out.println(sum.get());

       double average  = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("average"+average);
    }
}
