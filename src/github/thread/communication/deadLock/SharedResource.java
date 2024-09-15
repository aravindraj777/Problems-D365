package github.thread.communication.deadLock;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void produce(){

        System.out.println("Lock Acquired");
        isAvailable = true;

        try {
            Thread.sleep(8000);
        }
        catch (Exception e){

//            Handles exception
        }
        System.out.println("Lock release");
    }
}
