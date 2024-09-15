package github.thread.communication;

public class CommunicationMain {

    public static void main(String[] args) {

        SharedResource sharedResourceObj = new SharedResource();

        Thread producerThread = new Thread(()->{
            try {
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println("Exceptions in main");
            }
            sharedResourceObj.addItem();
        });
        Thread consumerThread = new Thread(sharedResourceObj::consumeItem);

        producerThread.start();
        consumerThread.start();

     }
}
