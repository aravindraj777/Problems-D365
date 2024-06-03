package basicQuestions;

public class VehicleTest {

    public void drive(){
        System.out.println("Drive ");
    }


    public int add(){
        return 2+3;
    }

    public int add(int a, int b){
        return a+b;
    }
}

class MainVeh{

    public static void main(String[] args) {

        VehicleTest vehicleTest = new VehicleTest();
        vehicleTest.drive();
        System.out.println(vehicleTest.add());
        System.out.println(vehicleTest.add(10,20));

        CarTestTwo carTestTwo = new CarTestTwo();
        carTestTwo.drive();
    }
}
