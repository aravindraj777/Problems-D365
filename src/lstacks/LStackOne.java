package lstacks;

import java.util.EmptyStackException;

public class LStackOne {

    private int height;
    private Node top;

   static class Node {
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
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
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
           System.out.print(currentNode.value+ " ");
           currentNode = currentNode.next;
       }
        System.out.print(" ]");
    }


    public static void main(String[] args) {

       LStackOne lStackOne = new LStackOne();
       lStackOne.push(50);
       lStackOne.push(89);
       lStackOne.push(77);
       lStackOne.push(66);
       lStackOne.push(55);

       lStackOne.printStack();
       lStackOne.pop();
        System.out.println();
       lStackOne.printStack();
    }
}
