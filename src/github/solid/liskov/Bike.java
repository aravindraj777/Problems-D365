package github.solid.liskov;

public interface Bike {

    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements  Bike {

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {

        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed+10;
    }
}

class Bicycle implements Bike{

    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");

    }

    @Override
    public void accelerate() {
//        something
    }
}
