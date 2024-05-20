package linkedList;

public class LinkedListThree {

    private Node head;
    private Node tail;
    private  int length;

    class  Node {
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
        length ++ ;
    }

    public void  printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListThree listThree = new LinkedListThree();
        listThree.addNode(40);
        listThree.addNode(32);
        listThree.addNode(22);
        listThree.addNode(12);
        listThree.printList();
    }
}
