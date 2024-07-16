package finalRev.linkedList;

public class DeletionLLThree {

    Node head;
    Node tail;
    private int length;
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void addElement (int value){
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next  = newNode;
            tail = newNode;
        }
        length ++ ;
    }

    public void printList(){
        Node curr = head;
        while (curr != null){
            System.out.println(curr.value);
            curr =  curr.next;
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
        Node prev  = null;

        while (curr != null && curr.value != value){
            prev  = curr;
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
class DeletionThreeMain{

    public static void main(String[] args) {

        DeletionLLThree deletionList = new DeletionLLThree();
        deletionList.addElement(33);
        deletionList.addElement(22);
        deletionList.addElement(11);
        deletionList.addElement(10);
        deletionList.printList();
        deletionList.deleteValue(22);
        System.out.println("===================");
        System.out.println("After deletion");
        deletionList.printList();

    }
}
