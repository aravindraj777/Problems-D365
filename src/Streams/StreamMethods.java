package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamMethods {


    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("Car","bus","Car","Bike","auto","Vanadium");

        vehicles.stream().distinct().forEach(System.out::println);


//        count
        long count  =  vehicles.stream().distinct().count();
        System.out.println(count);

        System.out.println("================");

//        limit
        vehicles.stream().limit(4).distinct().forEach(System.out::println);
    }
}
