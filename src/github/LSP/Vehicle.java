package github.LSP;

import java.util.ArrayList;
import java.util.List;

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

class BiCycle extends Vehicle{
}

class Car extends EngineVehicle{
}

class Bike extends EngineVehicle{
}

class LSPMain{
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new BiCycle());
        vehicleList.add(new Bike());
        vehicleList.add(new EngineVehicle());
        vehicleList.add(new Car());

        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new Car());
        engineVehicles.add(new Bike());

    }
}