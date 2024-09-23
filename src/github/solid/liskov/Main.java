package github.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycleOne());
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycleOne());

        for (Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getNumberOfWheels().toString());
        }

//        for (Vehicle vehicle : vehicleList){
//            System.out.println(vehicle.hasEngine());
//        }  //  This will not work as the vehicle doesn't have the hasEngine() method access
//           so that the error can be reduced
    }
}