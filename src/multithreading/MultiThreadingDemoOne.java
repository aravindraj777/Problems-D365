package multithreading;

public class MultiThreadingDemoOne implements Runnable {


    @Override
    public void run() {
        System.out.println("Code executed"+Thread.currentThread().getName());

    }
}

class DemoOneMain{

    public static void main(String[] args) {

        System.out.println("Inside main");
        MultiThreadingDemoOne runnableObj = new MultiThreadingDemoOne();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finished");

    }
}
