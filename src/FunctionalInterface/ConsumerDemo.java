package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> loggingObject = (val) -> {
            if (val > 10){
                System.out.println("Logging");
            }
            else {
                System.out.println("Not logging");
            }
        };

        loggingObject.accept(1);
    }
}
