package github.thread.communication.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SResource {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SResource(int bufferSize){
        this.bufferSize = bufferSize;
        sharedBuffer = new LinkedList<>();
    }

    public synchronized void produce(int item)throws  Exception{

        while (sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full , producer is waiting for consumer to consume");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("Produced "+ item);
        notify();
    }

    public synchronized int consume() throws Exception{
        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty , waiting for producer to produce");
            wait();
        }

        int item = sharedBuffer.poll();
        System.out.println("Consumed "+ item);
        notify();
        return item;
    }
}
