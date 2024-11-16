package github.generics.boundedGenerics.upperBound;

public class UpperBoundMain {

    public static void main(String[] args) {

        Print<Integer> upperBoundPrintObj = new Print<>();
        upperBoundPrintObj.setPrintValue(99);
        Integer value = upperBoundPrintObj.getPrintValue();
        System.out.println("This is a upperbound generic value - "+ value);

        Print<Long> upperBoundPrintObj1 = new Print<>();
        upperBoundPrintObj1.setPrintValue(22L);
        Long longValue = upperBoundPrintObj1.getPrintValue();
        System.out.println("This is a upperbound generic Long value - "+longValue);


    }
}
