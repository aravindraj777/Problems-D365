package finalRev.linkedList;

import javax.swing.*;

public class DeletionOfValueLL {


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
        length ++ ;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void deletionOfValue(int value){

        if (length == 0){
            System.out.println("List is Empty");
            return;
        }

        if (head.value  == value){
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

class DeletionMain{

    public static void main(String[] args) {

        DeletionOfValueLL deletionList = new DeletionOfValueLL();
        deletionList.append(34);
        deletionList.append(22);
        deletionList.append(11);
        deletionList.append(20);
        deletionList.append(35);
        deletionList.printList();
        deletionList.deletionOfValue(34);
        System.out.println("=====================");
        System.out.println("List after deletion");
        deletionList.printList();
    }
}
