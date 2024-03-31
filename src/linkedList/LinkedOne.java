package linkedList;

public class LinkedOne {


    private Node head;
    private Node tail;
    private int length ;
        static class Node{

            int value;
            Node next;
            Node(int value){
                this.value = value;
            }
        }

        LinkedOne(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;

        }


        public void append(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }
           else {
               tail.next = newNode;
               tail = newNode;
            }
           length++;

        }

        public void printList(){

            Node temp = head;
            while (temp != null){
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
        }


    public static void main(String[] args) {
            LinkedOne linkedOne = new LinkedOne(20);

            linkedOne.append(30);
            linkedOne.append(45);
            linkedOne.printList();
    }
}
