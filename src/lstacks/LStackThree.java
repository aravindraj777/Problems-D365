package lstacks;

import java.util.EmptyStackException;

public class LStackThree {

    public  int height;
    private Node top;

    static class Node {

        int value;
        Node next;

        Node (int value){
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

    public LStackThree.Node pop(){
        if(height == 0){
            throw new EmptyStackException();
        }
        else  {
            LStackThree.Node temp = top;
            top = top.next;
            top.next = null;
            height --;
            return temp;


        }
    }

    public void printStack(){
        Node currentNode = top;
        System.out.print("[");
        while (currentNode != null) {
            System.out.print(currentNode.value+ " ");
            currentNode = currentNode.next;
        }
        System.out.print("]");
    }

//    public int getHeight(){
//        return LStackThree.height;
//    }

    public static void main(String[] args) {
        LStackThree three = new LStackThree();
//        System.out.println(three.getHeight());

        three.push(70);
        three.push(60);
        three.push(56);
        three.push(32);
        three.printStack();
//        System.out.println(three.getHeight());
        three.pop();
//        System.out.println();
        three.printStack();
//        System.out.println();
//        System.out.println(three.getHeight());

    }

}
