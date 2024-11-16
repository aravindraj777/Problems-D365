package github.generics;

import github.generics.inheritance.ColorPrint;
import github.generics.inheritance.GenericSubClass;

public class PrintMain {

    public static void main(String[] args) {

        Print<Integer> newObj = new Print<>();
        newObj.setPrintValue(9);
        Integer printValue = newObj.getPrintValue();
        System.out.println(printValue);
        System.out.println("====================");
        System.out.println("Inheritance with non generic class");
        ColorPrint colorPrint = new ColorPrint();
        colorPrint.setPrintValue("This is a non generic class inheritance");
        String print = colorPrint.getPrintValue();
        System.out.println(print);

        System.out.println("=======================");
        GenericSubClass<Integer> genericSubClass = new GenericSubClass<>();
        genericSubClass.setPrintValue(99);
        Integer value = genericSubClass.getPrintValue();
        System.out.println(value+" This is a generic subclass inheritance");


        System.out.println("=====================");
        System.out.println("Multiple Type parameters....");
        TypeParameterMultiple<String,Integer> typeParameterMultiple = new TypeParameterMultiple<>();
        typeParameterMultiple.put("Arvind",24);


    }
}
