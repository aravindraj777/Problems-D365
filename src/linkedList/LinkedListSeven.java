package linkedList;

public class LinkedListSeven {

    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;

        }
    }

    public void setNode(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void isLoopExists(){
        Node fast = head;
        Node slow = head;
        while (fast != null && slow != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                System.out.println("Loopp exists"+fast.value);
                break;
            }
        }
        if (slow == null || fast == null || fast.next == null){
            System.out.println("No loops present ");
        }

    }

    public void printNode(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value+" ");
            temp  = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListSeven linkedListSeven = new LinkedListSeven();
        linkedListSeven.setNode(89);
        linkedListSeven.setNode(77);
        linkedListSeven.setNode(66);
        linkedListSeven.setNode(55);
        linkedListSeven.head.next.next = linkedListSeven.head.next;
        linkedListSeven.isLoopExists();
//        linkedListSeven.printNode();
    }
}
