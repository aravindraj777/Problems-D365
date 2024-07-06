package linkedList.operationsRevise;

public class FindMiddleLinked {


    Node head;
    Node tail;

    int height;
    static class Node {

        Node next;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    public void addNode(int value){
        Node newNode = new Node(value);

        if (height == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        height++;
    }

    public int findMiddleElement(){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow.value;
    }

    public static void main(String[] args) {
        FindMiddleLinked findMiddleLinked = new FindMiddleLinked();
        findMiddleLinked.addNode(349);
        findMiddleLinked.addNode(43);
        findMiddleLinked.addNode(22);
        int middleValue = findMiddleLinked.findMiddleElement();
        System.out.println(middleValue);
    }
}
