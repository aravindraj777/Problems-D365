package multithreading;

public class MultithreadingDemoTwo extends Thread{


    @Override
    public void run() {
        System.out.println("Inside custom thread");
    }
}

class DemoTwoMain{

    public static void main(String[] args) {

        System.out.println("Inside main");
        MultithreadingDemoTwo threadClass = new MultithreadingDemoTwo();
        threadClass.start();
        System.out.println("Finished purpose");
    }
}
