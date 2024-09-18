package github.thread.locks.semaphoreLock;

public class Main {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::producer);
        Thread t2 = new Thread(resource::producer);
        Thread t3 = new Thread(resource::producer);
        Thread t4 = new Thread(resource::producer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
