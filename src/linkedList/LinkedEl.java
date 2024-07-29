package linkedList;

public class LinkedEl {

    private Node head;
    private Node tail;
    private int length;

    LinkedEl(){
        length = 0;
        head = tail = null;
    }
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int index, int value){
            if (index < 0 || index > length) return false;
            if (index == 0){
                prepend(value);
                return true;
            }
            if (index == length){
                append(value);
                return true;
            }
            Node newNode = new Node(value);
            Node temp = get(index-1);
            newNode.next = temp.next;
            temp.next= newNode;
            length++;
            return true;

    }

    public void append(int value){
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

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node get(int index){
        if (index < 0  && index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0 ; i< index ; i++){
            temp = temp.next;
        }
        return temp;
    }

}
