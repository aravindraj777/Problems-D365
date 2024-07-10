package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (Integer val)->{
            if (val % 2 == 0){
                return true;
            }
            else {
                return false;
            }
        };

        System.out.println(isEven.test(49));
    }
}
