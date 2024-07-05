package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMax {


    public static void main(String[] args) {


        List<Integer> numbersList = Arrays.asList(10,2,3,5,6,7,78,8);
        long countOfEven = numbersList.stream().filter(num -> num % 2 == 0).count();
        System.out.println(countOfEven);


//        min
       Optional<Integer> minValue =  numbersList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });

        System.out.println(minValue.get());

//        max
        Optional<Integer> maxValue = numbersList.stream().max((val1,val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(maxValue.get());


//        Reduce

        List<String> stringList  = Arrays.asList("A","B","C","D","E","F");
        Optional<String> reduced = stringList.stream().reduce((val,combinedVal) -> {
            return val+combinedVal;
        });

        System.out.println(reduced.get());
    }
}
