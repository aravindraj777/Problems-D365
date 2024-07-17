package finalRev.stack;

import java.util.EmptyStackException;

public class StackThreeT {

    Node top;
    int height ;
    class Node {
        String value;
        Node next;

        Node (String value){
            this.value = value;
            this.next = null;
        }
    }

    public void push(String value){
        Node newNode  = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else {
           newNode.next = top;
           top = newNode;
        }
        height ++ ;
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
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.print("]");
    }

    public void reversePrint(Node top){

        if (top == null){
            return;
        }
        reversePrint(top.next);
        System.out.print(top.value);
    }
}

class ThreeMain {

    public static void main(String[] args) {

        StackThreeT stack = new StackThreeT();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        stack.printStack();
        stack.reversePrint(stack.top);

    }
}
