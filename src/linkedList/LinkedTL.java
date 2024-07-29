package linkedList;

public class LinkedTL {

    private Node head;
    private Node tail;
    private int length;

    LinkedTL(){
        length = 0;
    }
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int index,int value){
        if (index < 0 || index > length){
            return false;
        }
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
           newNode.next = head;
           head = newNode;
        }
        length++;
    }

    public void append(int value){
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

    public Node get(int index){
        if (index < 0 && index >= length) return null;
        Node temp = head;
        for (int i = 0 ; i< index ;i ++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    public boolean set(int index,int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
}

class TLMain{

    public static void main(String[] args) {

        LinkedTL linkedTL = new LinkedTL();
        linkedTL.insert(0,100);
        linkedTL.insert(1,10);
        linkedTL.insert(2,20);
        linkedTL.insert(3,30);
        linkedTL.insert(4,40);
        linkedTL.insert(5,50);

        linkedTL.printList();
        System.out.println("===========");
        linkedTL.insert(2,70);
        linkedTL.printList();
        linkedTL.set(2,700);
        System.out.println("================");
        linkedTL.printList();
    }
}
