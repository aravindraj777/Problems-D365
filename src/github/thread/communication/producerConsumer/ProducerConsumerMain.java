package github.thread.communication.producerConsumer;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        SResource sharedResource = new SResource(3);

        Thread producerThread = new Thread(()->{

            try {
                for (int i = 0 ; i<= 6 ; i++){
                    sharedResource.produce(i);
                }
            }
            catch (Exception e){
//
            }
        });

        Thread consumerThread = new Thread(()->{
            try {
                for (int i = 0 ; i <= 6 ; i++){
                    sharedResource.consume();
                }
            }
            catch (Exception e){
//
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
