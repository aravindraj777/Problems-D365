package finalRev.linkedList;

import javax.sound.midi.MidiFileFormat;

public class DeletionLLTwo {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        Node next;
        int value;
        Node (int value){
            this.value =value;
        }
    }

    public void insertInToList(int value){

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

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void deleteValue(int value){

        if (length == 0){
            System.out.println("The list is empty");
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

class DeletionLLTwoMain{
    public static void main(String[] args) {

        DeletionLLTwo deletionList = new DeletionLLTwo();
        deletionList.insertInToList(22);
        deletionList.insertInToList(1);
        deletionList.insertInToList(222);
        deletionList.insertInToList(99);
        deletionList.printList();
        System.out.println("===============");
        deletionList.deleteValue(222);
        deletionList.printList();
    }
}
