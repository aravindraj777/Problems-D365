package lstacks;

import java.util.EmptyStackException;

public class LStackTwo {

    private int height; // Ensure this is an instance variable
    private Node top;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public void printStack() {
        Node currentNode = top;
        System.out.print("[");
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }

    public Node pop() {
        if (height == 0) {
            throw new EmptyStackException();
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null; // Clear the next reference of the popped node
            height--;
            return temp;
        }
    }

    public void reverse() {
        if (height <= 1) {
            return; // Base case: If stack has 0 or 1 element, no need to reverse
        }
        Node prev = null;
        Node current = top;
        Node next = null;

        while (current != null) {
            next = current.next; // Save next node
            current.next = prev; // Reverse the link
            prev = current; // Move pointers one position ahead
            current = next;
        }

        top = prev; // Adjust the top to the new head of the reversed stack
    }

    public static void main(String[] args) {
        LStackTwo lStackTwo = new LStackTwo();
        lStackTwo.push(70);
        lStackTwo.push(50);
        lStackTwo.push(60);
        lStackTwo.push(80);
        lStackTwo.push(90);
        lStackTwo.push(77);

        System.out.print("Original stack: ");
        lStackTwo.printStack(); // Print original stack

        lStackTwo.reverse(); // Reverse the stack

        System.out.print("Reversed stack: ");
        lStackTwo.printStack(); // Print reversed stack
    }
}
