package github.thread.locks.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(()->{
            sharedResource.producer(lock);
        });

        Thread t2 = new Thread(()->{
            sharedResource.producer(lock);
        });

        SharedResource sharedResource1 = new SharedResource();
        Thread t3 = new Thread(()->{
            sharedResource1.consume(lock);
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
