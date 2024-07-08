package multithreading.monitorLock;

public class SharedResource {

    boolean isItemPresent = false;

    public synchronized void addItem (){
        isItemPresent = true;
        System.out.println("Producer thread calling the notify method");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consume item method");

        if (!isItemPresent){
            try {
                System.out.println("Consumer thread waiting");
                wait();
            }
            catch (Exception e){
                System.out.println("Exception"+e.getMessage());
            }
        }
        isItemPresent = false;
    }
}
