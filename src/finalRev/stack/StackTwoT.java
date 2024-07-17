package finalRev.stack;

import java.util.EmptyStackException;

public class StackTwoT {

    Node top;
    int height;
    class Node {

        Node next;
        int value;

        Node (int value){
            this.value = value;
            this.next = null;
        }
    }

    public void push(int value){
        Node newNode  = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;

        }
        height++;
    }

    public Node pop(){
        if (height == 0){
            throw new EmptyStackException();
        }
        else {
            Node temp = top;
            top = temp.next;
            height -- ;
            return temp;
        }
    }

    public void printStack(){

        Node temp = top;
        System.out.print("[");
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }
}

class StackTwoMain{

    public static void main(String[] args) {
        StackTwoT stack = new StackTwoT();
        stack.push(44);
        stack.push(54);
        stack.push(34);
        stack.push(22);

        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}
