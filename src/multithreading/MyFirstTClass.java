package multithreading;

public class MyFirstTClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Code executed"+Thread.currentThread().getName());
    }
}
