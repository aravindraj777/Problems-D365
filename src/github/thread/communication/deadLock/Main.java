package github.thread.communication.deadLock;

public class Main {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();
        System.out.println("Main thread started");

        Thread t1 = new Thread(()->{
            System.out.println("Thread1 calling produce method");
            resource.produce();;
        });

        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
//                Exception handling
            }

            System.out.println("Thread2 calling produce method");
            resource.produce();
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
//
        }
        System.out.println("Thread1 is suspended");
        /*
         cant write resume(), suspend() , stop() as these methods
         were deprecated
        */
//        t1.resume();
        System.out.println("Main thread is finishing it work");
    }
}
