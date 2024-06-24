package multithreading;

public class MainTClass {

    public static void main(String[] args) {

        System.out.println("Going inside main method"+Thread.currentThread().getName());
        MyFirstTClass runnableObj = new MyFirstTClass();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finish main method"+Thread.currentThread().getName());
    }
}
