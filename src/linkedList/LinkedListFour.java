package linkedList;

public class LinkedListFour {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        String value;
        Node next;
        Node(String value){
            this.value = value;
        }
    }

    public void addNode(String value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail  = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++ ;
    }

    public void printList(){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void loopExistOrNot(){
        Node fast = head;
        Node slow  = head;

        while (slow != null && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                System.out.println("loop exists "+fast.value);
                return;

            }
        }
        if (slow == null || fast == null || fast.next == null){
            System.out.println("No loop detected");
        }
    }

    public static void main(String[] args) {

        LinkedListFour listFour = new LinkedListFour();
        listFour.addNode("Arvind");
        listFour.addNode("Akbar");
        listFour.addNode("Anand");

        listFour.addNode("Arun");
        listFour.addNode("Amal");
        listFour.printList();
        listFour.head.next.next.next = listFour.head.next;


       listFour.loopExistOrNot();
//        listFour.printList();
    }
}





