package github.thread.locks.semaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    boolean isAvailable  = false;
    Semaphore lock = new Semaphore(2);  // number of threads than can go inside the critical section.

    public void producer(){
        try {

            lock.acquire();
            System.out.println("Lock acquired by "+ Thread.currentThread().getName());
            isAvailable =  true;
            Thread.sleep(4000);
        }
        catch (Exception e){
//            Handling exceptions
        }
        finally {
            lock.release();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
}
