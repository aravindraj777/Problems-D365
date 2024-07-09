package linkedList.operationsRevise;

public class ReverseList {


   Node head;
   Node tail;

    int height;
    static class Node {

       Node next;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    public void addNode(int value){
       Node newNode  = new Node(value);
        if (height == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        height++;
    }

    public Node reverseList(Node head) {
      Node prev = null;
        Node current = head;


        while(current != null) {
           Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void printList(){
       Node temp = head;
        while (temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
       ReverseList reverseList = new ReverseList();
        reverseList.addNode(45);
        reverseList.addNode(34);
        reverseList.addNode(21);
        reverseList.addNode(11);
        reverseList.addNode(33);

        reverseList.printList();
        reverseList.head = reverseList.reverseList(reverseList.head);

        System.out.println("================");
        reverseList.printList();

    }
}
