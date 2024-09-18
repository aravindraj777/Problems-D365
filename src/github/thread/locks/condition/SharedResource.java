package github.thread.locks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer(){

        try {
            lock.lock();
            System.out.println("Producer lock acquired by "+ Thread.currentThread().getName());

            if (isAvailable){
                System.out.println("Produce thread is waiting "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signal();
        }
        catch (Exception e){
            System.out.println("Exceptions ");
        }

        finally {
            lock.unlock();
            System.out.println("Produce lock released by "+Thread.currentThread().getName());
        }
    }


    public void consume(){
        try {

            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume lock acquired by "+Thread.currentThread().getName());

            if (!isAvailable){
                System.out.println("Consumer thread is waiting "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signal();
        }

        catch (Exception e){
            System.out.println("Exceptions");
        }

        finally {
            lock.unlock();
            System.out.println("Consumer lock released by "+ Thread.currentThread().getName());
        }
    }
}
