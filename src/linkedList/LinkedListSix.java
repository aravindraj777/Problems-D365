package linkedList;

public class LinkedListSix {

    private int height;
    private Node head;
    private Node tail;
    class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void addNode(int value){
        Node newNode = new Node(value);
        if(height == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        height++;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public void isLoopExists(){

        Node fast = head;
        Node slow = head;

        while (fast != null && slow != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast ){
                System.out.println("Loop Exists"+ fast.value);
                break;
            }
        }
        if(slow == null || fast == null || fast.next == null){
            System.out.println("No loop ");
        }
    }

    public static void main(String[] args) {
        LinkedListSix linkedListSix = new LinkedListSix();
        linkedListSix.addNode(80);
        linkedListSix.addNode(67);
        linkedListSix.addNode(77);
        linkedListSix.addNode(66);
        linkedListSix.isLoopExists();

        linkedListSix.printList();


    }
}
