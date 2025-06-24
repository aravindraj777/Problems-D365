package LLD.strategy;

public class Vehicle {

    DriveStrategy driveStrategy;
     Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
