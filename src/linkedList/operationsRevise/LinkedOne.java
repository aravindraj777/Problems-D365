package linkedList.operationsRevise;

public class LinkedOne {
    Node head;
    Node tail;

    private int length;


    static  class Node {

        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }


    public void addNode(int value){

        Node newNode  = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    public void printList(){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void isLoopExists(){

        Node fast = head;
        Node slow = head;

        while (fast != null && slow != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                System.out.println("Loop exists");
                break;
            }

        }
        if (slow == null || fast == null || fast.next == null){
            System.out.println("Loop not exists");
        }

    }


    public static void main(String[] args) {

        LinkedOne linkedOne = new LinkedOne();
        linkedOne.addNode(34);
        linkedOne.addNode(12);
        linkedOne.addNode(22);
        linkedOne.addNode(90);

        linkedOne.printList();

        linkedOne.isLoopExists();
    }


}
