package linkedList;

public class LinkedListFive {

    private int height;
    private Node head;
    private Node tail;
    class Node {
        String value;
        Node next;
        Node(String value){
            this.value = value;
        }
    }

    public void addNode(String value){
        Node newNode = new Node(value);
        if (height == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        height ++;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value+ " ");
            temp = temp.next;
        }
    }
    public void isLoopExists(){
        Node fast = head;
        Node slow = head;

        while (fast != null && slow != null && fast.next != null){
            fast = fast.next.next;
            slow  = slow.next;
            if(slow== fast){
                System.out.println("Loop exists"+fast.value);
                break;
            }
        }
        if (slow == null || fast == null || fast.next == null){
            System.out.println("No loop detected");
        }
    }

    public static void main(String[] args) {
        LinkedListFive linkedListFive = new LinkedListFive();
        linkedListFive.addNode("Arvind");
        linkedListFive.addNode("Amal");
        linkedListFive.addNode("Aman");
        linkedListFive.addNode("Aswathy");
        linkedListFive.printList();
        linkedListFive.isLoopExists();
    }
}
