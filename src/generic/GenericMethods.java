package generic;

public class GenericMethods {

    public static void main(String[] args) {

        printData("Hello");

        GenericMethods obj = new GenericMethods();
        obj.<String>doubleData("Double data");

    }

    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }
}
