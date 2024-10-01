package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Car {

    String carName;
    String carType;

    Car(String name,String type){
        this.carName = name;
        this.carType = type;
    }
}

class CarMain{

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("Suv","Petrol");
        cars[1] = new Car("Sedan","diesel");
        cars[2] = new Car("HatchBack","cng");


//        ascending Order
        Arrays.sort(cars,(car1,car2)-> car1.carName.compareTo(car2.carName));

        for (Car car : cars){
            System.out.println(car.carName);
        }

        System.out.println("============================");

//        Descending Order
        Arrays.sort(cars,(car1,car2)-> car2.carName.compareTo(car1.carName));
        for (Car car : cars){
            System.out.println(car.carName);
        }
    }


}