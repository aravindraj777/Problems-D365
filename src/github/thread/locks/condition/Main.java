package github.thread.locks.condition;

public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i< 2 ; i++){
                sharedResource.producer();
            }
        });

        Thread t2  = new Thread(()->{
            for (int i= 0 ; i < 2 ; i++){
                sharedResource.consume();
            }
        });

        t1.start();
        t2.start();
    }
}
