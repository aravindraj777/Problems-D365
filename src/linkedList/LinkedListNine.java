package linkedList;

public class LinkedListNine {

    private Node head;
    private Node tail;
    private int length;

    class Node {

        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    public void addToList(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void isLoopExists() {
        Node fast = head;
        Node slow = head;

        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("Loop Exists");
                break;
            }
            if (slow == null || fast == null || fast.next == null) {
                System.out.println("No loop Exists");
            }
        }
    }
}
    class NineMain {

        public static void main(String[] args) {

            LinkedListNine listNine = new LinkedListNine();
            listNine.addToList("A");
            listNine.addToList("B");
            listNine.addToList("C");
            listNine.addToList("D");
            listNine.addToList("E");

            listNine.printList();
            listNine.isLoopExists();
        }
    }

