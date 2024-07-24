package LinkedListTwo;

import finalRev.linkedList.LinkedListTOne;

public class LinkedListOne {

    private Node head;
    private Node tail;

    private int length;

    LinkedListOne(){
        head = tail = null;
    }
    class Node {
        String value;
        Node next;

        Node (String value){
            this.value = value;
        }
    }

    private boolean isEmpty(){
        return length == 0;
    }

    public void push(String value){
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;

    }

//    public void deleteDuplicates(){
//       Node temp = head;
//       Node curr = head;
//
//
//       while(temp!= null && curr!= null && curr.next!= null){
//           if (temp.value.equals(curr.next.value)){
//               temp.next = curr.next.next;
//               curr = curr.next.next;
//           }
//           temp = temp.next;
//           curr = curr.next;
//
//       }
//
//    }

    public void deleteDuplicates() {
        if (head == null) return; // If the list is empty, nothing to do

        Node current = head;

        while (current != null) {
            Node runner = current;

            // Remove all nodes with the same value as current node
            while (runner.next != null) {
                if (runner.next.value.equals(current.value)) {
                    runner.next = runner.next.next; // Skip the duplicate node
                } else {
                    runner = runner.next; // Move to the next node
                }
            }

            current = current.next; // Move to the next node
        }
    }


    public void printList(){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.value+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedListOne linkedList = new LinkedListOne();
        linkedList.push("A");
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("A");

        linkedList.printList();
        System.out.println("==============");
        linkedList.deleteDuplicates();
        linkedList.printList();
    }
}
