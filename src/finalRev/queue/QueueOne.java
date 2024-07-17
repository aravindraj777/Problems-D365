package finalRev.queue;

import javax.swing.plaf.PanelUI;

public class QueueOne {

    Node first;
    Node last;
    int length;

    class Node {
        Node next;
        int value;

        Node (int value){
            this.value = value;
        }
    }

    public void enqueue(int value){
        Node newNode  = new Node(value);

        if (length == 0){
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node  dequeue(){

        Node temp = first;
        if (length == 0){
            return null;
        }
        if (length == 1){
            first = null;
            last = null;
        }
        else {

            first = first.next;
            temp.next = null;
        }
        length -- ;
        return temp;
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }
}
class QueueOneMain{
    public static void main(String[] args) {

        QueueOne queue = new QueueOne();
        queue.enqueue(55);
        queue.enqueue(22);
        queue.enqueue(10);
        queue.enqueue(9);

        queue.printQueue();
    }
}