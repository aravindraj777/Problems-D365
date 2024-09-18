package github.thread.locks.stampedLock;

import java.util.concurrent.locks.StampedLock;

/**
 This is a creation of optimistic lock , One of the optimistic lock is StampedLock.
 */
public class SharedResource {

    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer(){

        /*
         method allows the thread to perform a non-blocking read operation optimistically,
         assuming there won't be a write operation happening simultaneously.
         It returns a stamp, which is essentially a version number of the lock at the time the optimistic read begins.
         */
        long stamp =  lock.tryOptimisticRead();

        try{
            System.out.println("Taken optimistic read"+Thread.currentThread().getName());
            a = 11;
            Thread.sleep(8000);
            if (lock.validate(stamp)){
                System.out.println("Updated a value successfully");
            }
            else {
                System.out.println("Rollback to previous state");
                a = 10;
            }

        }
        catch (Exception e){
//    Handle any exceptions
        }
    }

    /*
    This is a pessimistic way.
    * */
    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("write lock acquired by "+ Thread.currentThread().getName());

        try {
            System.out.println("Performing work");
            a = 9;
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("write lock released by "+Thread.currentThread().getName());
        }
    }

}
