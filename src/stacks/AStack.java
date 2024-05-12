package stacks;

public class AStack {

    int[] stack = new int[5];
    int top  = -1;

    public boolean isEmpty(){
        return top == -1;

    }
    public boolean isFull(){
        return top == stack.length - 1;
    }

    public boolean push(int data) throws  Exception {
        if(isFull()){
            throw new Exception("Stack OverFlow");
        }
        top++;
        stack[top] = data;
        return true;
    }

    public void print(){
        for (int i = 0;i<= top ;i++){
            System.out.println(stack[i]);
        }
    }

}

class Main {
    public static void main(String[] args) throws Exception {
        AStack stack = new AStack();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);

        stack.print();

    }
}