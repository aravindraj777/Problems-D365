package lstacks.array;

public class AStackThree {

    private int[] stackArray;
    private int top;
    private int maxsize;
    private int height;

    AStackThree(int size){
        maxsize = size;
        stackArray = new int[maxsize];
        top = -1;
        height = 0;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full , unable to push "+ value);
            return;
        }
        stackArray[++top] = value;
        height++;

    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        int pop = stackArray[top--];
        height--;
        return pop;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Empty stack");
            return -1;
        }
        return stackArray[top];
    }

    private boolean isFull(){
        return (height == maxsize);
    }

    private boolean isEmpty(){
        return (height == 0);
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("Stack empty");
            return;
        }
        System.out.print("[");
        for (int i = top ;i >= 0 ; i --){
            System.out.print(stackArray[i]+" ");

        }
        System.out.print("]");

    }

    public static void main(String[] args) {

        AStackThree stackThree = new AStackThree(4);
        stackThree.push(4);
        stackThree.push(2);
        stackThree.push(11);
        stackThree.push(32);
//        stackThree.push(90);
        stackThree.printStack();
    }
}
