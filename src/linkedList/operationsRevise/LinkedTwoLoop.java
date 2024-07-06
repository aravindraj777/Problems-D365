package linkedList.operationsRevise;

public class LinkedTwoLoop {


    Node head;
    Node tail;

    int length;
     static class Node {

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
         length++;
    }

    public void printList(){

         Node curr = head;
         while (curr != null){
             System.out.println(curr.value);
             curr = curr.next;
         }

    }

    public void isLoopExists(){

         Node fast = head;
         Node slow = head;

         while (fast != null && slow != null && fast.next != null){

             fast = fast.next.next;
             slow = slow.next;

             if (fast == slow){
                 System.out.println("Loop Exists");
                 break;
             }
         }
         if (fast == null || slow == null || fast.next == null){
             System.out.println("Loop not exists");
         }
    }


    public static void main(String[] args) {

         LinkedTwoLoop linkedTwoLoop  = new LinkedTwoLoop();
         linkedTwoLoop.addNode(45);
         linkedTwoLoop.addNode(12);
         linkedTwoLoop.addNode(33);
         linkedTwoLoop.addNode(22);
         linkedTwoLoop.addNode(222);

         linkedTwoLoop.printList();
        linkedTwoLoop.head.next.next.next = linkedTwoLoop.head.next;
         linkedTwoLoop.isLoopExists();
    }
}
