package finalRev.linkedList;

public class LinkedListTOne {

    private Node head;
    private Node tail;
    private int length;
    class Node {
        Node next;
        int value;

        Node (int value){
            this.value = value;
        }
    }

    public void addNode (int value){
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

    public void printNode(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void deleteNode(int value){
        if (length == 0){
            System.out.println("List is empty");
            return;
        }

        if (head.value == value){
            head = head.next;
            if (head == null){
                tail = null;
            }
            length -- ;
            return;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null && curr.value != value){
            prev = curr;
            curr = curr.next;
        }

        if (curr == null){
            System.out.println("Value not found in the list");
            return;
        }

        prev.next = curr.next;
        if (curr.next == null){
            tail = prev;
        }
        length -- ;
    }


}

class LLOneMain{

    public static void main(String[] args) {

        LinkedListTOne linkedListTOne = new LinkedListTOne();
        linkedListTOne.addNode(45);
        linkedListTOne.addNode(22);
        linkedListTOne.addNode(12);
        linkedListTOne.addNode(33);
        linkedListTOne.addNode(99);

        linkedListTOne.printNode();
        linkedListTOne.deleteNode(22);
        System.out.println("=========");
        linkedListTOne.printNode();
    }
}