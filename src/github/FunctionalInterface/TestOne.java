package github.FunctionalInterface;

import java.util.function.Consumer;

public class TestOne {

    public static void main(String[] args) {

        Consumer<Integer> conObj = (Integer value)-> {
            if(value > 10){
                System.out.println("Greater than 10");
            }

        };
        conObj.accept(30);
    }
}
