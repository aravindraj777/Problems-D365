package github.thread.locks.stampedLock;

public class Main {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::producer);

        Thread t2 = new Thread(resource::consumer);

        t1.start();
        t2.start();
    }
}
