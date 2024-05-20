package linkedList;

public class LinkedListEight {

    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public void addNode(int value){
        Node newNode = new Node(value);
        if (length == 0){
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
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public void  isLoopExists(){

        Node fast = head;
        Node slow = head;
        while (fast != null &&  slow != null && fast.next!= null){
            fast = fast.next.next;
            slow  = fast.next;
            if (slow == fast){
                System.out.println("Loop Exists"+ fast.value);
            }
        }
        if (fast == null || slow == null || fast.next == null){
            System.out.println("No loop Exists");
        }
    }

    public static void main(String[] args) {
        LinkedListEight listEight = new LinkedListEight();
        listEight.addNode(90);
        listEight.addNode(77);
        listEight.addNode(66);
        listEight.addNode(55);
        listEight.addNode(45);
        listEight.printList();
    }
}
