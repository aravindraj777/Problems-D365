package github.solid.liskov;

public class Vehicle {

    public Integer getNumberOfWheels(){
        return 2;
    }
}

class EngineVehicle extends Vehicle{

    public boolean hasEngine(){
        return true;
    }
}

class BicycleOne extends Vehicle {


}

