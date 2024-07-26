package lstacks.array;

import lstacks.LStackTwo;

public class AStackOne {

    private int[] stackArray;
    private int top;
    private int maxsize;
    private int height;

    public AStackOne(int size){
        maxsize = size;
        stackArray = new int[maxsize];
        top = -1;
        height = 0;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full , unable to push " + value);
            return;
        }
        stackArray[++top] = value;
        height++;
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("[");
        for(int i = top ;i >= 0 ;i--){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("]");
    }

    private boolean isEmpty(){
        return (height == 0);
    }

    private boolean isFull(){
        return (height == maxsize);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty, unable to pop");
            return -1;
        }
        int value = stackArray[top--
                ];
        height--;
        return value;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty, unable to peek");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {

        AStackOne stack = new AStackOne(4);
        stack.push(18);
        stack.push(12);
        stack.push(22);
        stack.push(11);
//        stack.printStack();
        System.out.println(stack.pop());

    }
}
