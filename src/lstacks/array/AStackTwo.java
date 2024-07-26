package lstacks.array;

public class AStackTwo {

    private int[] stackArray;
    private int top;
    private int maxsize;
    private int height;

    public AStackTwo(int size){
        maxsize = size;
        top = -1;
        height = 0;
        stackArray = new int[maxsize];
    }

    private boolean isEmpty(){
        return (height == 0);
    }

    private boolean isFull(){
        return (height == maxsize);
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full , Unable to insert "+value);
            return;
        }
        stackArray[++top] = value;
        height++;
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("[");
        for (int i = top ; i >= 0 ; i--){
            System.out.print(stackArray[i]+" ");

        }
        System.out.print("]");
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Unable to pop, Stack is empty");
            return -1;
        }
        int popValue = stackArray[top--];
        height--;
        return popValue;

    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Unable to peek, Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {

        AStackTwo stackTwo = new AStackTwo(10);
        stackTwo.push(10);
        stackTwo.push(20);
        stackTwo.push(33);
        stackTwo.push(23);
        stackTwo.push(90);
        stackTwo.printStack();

        System.out.println(stackTwo.pop());
        System.out.println(stackTwo.peek());
    }
}
