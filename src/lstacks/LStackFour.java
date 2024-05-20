package lstacks;

import java.util.EmptyStackException;

public class LStackFour {

    int height;
    Node top;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
        height ++;
    }

    public Node pop(){
        if(height == 0){
            throw new EmptyStackException();
        }
        else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            height -- ;
            return temp;
        }
    }

    public void printStack(){
        Node currentNode = top;
        System.out.print("[");
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        LStackFour lStackFour = new LStackFour();
        lStackFour.push(40);
        lStackFour.push(33);
        lStackFour.push(22);
        lStackFour.push(24);

        lStackFour.printStack();
        lStackFour.pop();
        lStackFour.printStack();

    }

}
