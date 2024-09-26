package github.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {


        Function<Integer,String> integerToString = (Integer num) ->{
            return num.toString();
        } ;

        System.out.println(integerToString.apply(54));
    }
}
