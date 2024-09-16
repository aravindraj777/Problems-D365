package github.thread.locks.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;

    public void producer(ReentrantLock lock){

        try {
            lock.lock();
            System.out.println("Lock acquired by "+Thread.currentThread().getName() );
            isAvailable = true;
            Thread.sleep(4000);
        }
        catch (Exception e){
//            Handling exceptions
        }
        finally {
            lock.unlock();
            System.out.println("lock released "+Thread.currentThread().getName());
        }
    }
}
