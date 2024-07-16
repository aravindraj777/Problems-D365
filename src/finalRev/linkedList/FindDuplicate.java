package finalRev.linkedList;

import java.util.HashSet;

public class FindDuplicate {

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

    public void findDuplicates(){
        HashSet<Integer> seenValues = new HashSet<>();
        Node curr = head;
        boolean hasDuplicates = false;

        while (curr != null){

            if (seenValues.contains(curr.value)){
                System.out.println("Duplicate found "+curr.value);
                hasDuplicates = true;
            }
            else {
                seenValues.add(curr.value);
            }
            curr = curr.next;
        }
        if (!hasDuplicates){
            System.out.println("No duplicates found");
        }
    }
}

class DuplicateFoundMain{

    public static void main(String[] args) {

        FindDuplicate linkedList = new FindDuplicate();
        linkedList.insertInToList(45);
        linkedList.insertInToList(22);
        linkedList.insertInToList(12);
        linkedList.insertInToList(33);
        linkedList.insertInToList(22);
        linkedList.insertInToList(99);
        linkedList.insertInToList(12);
        linkedList.findDuplicates();

    }
}
