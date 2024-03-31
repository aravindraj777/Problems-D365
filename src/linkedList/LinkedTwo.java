package linkedList;

public class LinkedTwo {

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

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList(){

        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        LinkedTwo listTwo = new LinkedTwo();
        listTwo.addNode(30);
        listTwo.addNode(21);
        listTwo.addNode(32);
        listTwo.addNode(211);

        listTwo.printList();
    }


}
