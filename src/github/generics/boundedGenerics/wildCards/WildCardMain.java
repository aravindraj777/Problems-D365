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
    }
}
