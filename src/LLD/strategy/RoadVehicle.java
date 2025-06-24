package LLD.strategy;

public class RoadVehicle extends Vehicle{

    RoadVehicle(){
        super(new NormalDriveStrategy());
    }
}
