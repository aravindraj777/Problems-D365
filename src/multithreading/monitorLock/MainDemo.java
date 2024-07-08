package multithreading.monitorLock;

public class MainDemo {

    public static void main(String[] args) {


        SharedResource sharedResourceObj = new SharedResource();
        Thread producerThread = new Thread(()->{
            try {
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            sharedResourceObj.addItem();
        });
        Thread consumerThread = new Thread(sharedResourceObj::consumeItem);

        producerThread.start();
        consumerThread.start();

    }
}
