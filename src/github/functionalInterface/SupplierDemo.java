package github.functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> isEvenNumber = ()->{
            return  "This is the return value";
        };

        System.out.println( isEvenNumber.get());
    }
}
