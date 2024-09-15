package github.thread.communication;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by "+ Thread.currentThread().getName()+ " and invoking");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consume Item method invoked by "+ Thread.currentThread().getName());

        while (!itemAvailable){
            try {
                System.out.println("Thread "+ Thread.currentThread().getName() + " is waiting");
                wait();
            }
            catch (Exception e){
                System.out.println("Handles exception");
            }
        }

        System.out.println("Item consumed by : "+ Thread.currentThread().getName());
        itemAvailable = false;
    }
}
