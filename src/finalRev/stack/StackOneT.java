package finalRev.stack;

import java.util.EmptyStackException;

public class StackOneT {

    Node top;
    int height;

    class Node {
        int value;
        Node next;

        Node (int value){
            this.value = value;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;

        }
        else {
            newNode.next = top;
            top = newNode;
        }
        height ++;
    }

    public void printStack(){
        Node curr = top;
        System.out.print("[");
        while (curr != null){
            System.out.print(curr.value+",");
            curr = curr.next;
        }
        System.out.print("]");
    }

    public Node  pop(){
        if (height == 0){
            throw new EmptyStackException();

        }
        else {
            Node temp = top;
            top = top.next;
            height -- ;
            return temp;
        }
    }
}

class StackMainOneT {

    public static void main(String[] args) {

        StackOneT stack = new StackOneT();
        stack.push(45);
        stack.push(22);
        stack.push(10);
        stack.push(44);

        stack.printStack();
        StackOneT.Node  poppedValue  = stack.pop();
        System.out.println(poppedValue.value+ " pop");
        stack.printStack();


    }
}