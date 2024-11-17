package github.generics.boundedGenerics.wildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCardMain {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        List<Bus> busList = new ArrayList<>();
        List<Car> carList  = new ArrayList<>();


        Print printObj = new Print();
//        Vehicle list is acceptable as it is lower bound happening hereg
        printObj.setPrintValues(vehicleList);

//        For wild card method
        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>();

//        This is acceptable in wildcard , we can add multiple datatypes also
        printObj.computeList(integerList,floatList);

//        This is not acceptable as it is not a wildcard method .
//        This is acceptable as both having same datatypes.g
        printObj.computeList1(integerList,integerList1);
    }
}
