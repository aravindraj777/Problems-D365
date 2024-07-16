package stacks;

import java.util.Stack;

public class StackSorting {


    public static void stackSort(Stack<Integer> stack) {

        Stack<Integer> auxStack = new Stack<>();

        while (!stack.isEmpty()){
            int temp = stack.pop();

            while (!auxStack.isEmpty() && auxStack.peek() > temp){
                stack.push(auxStack.pop());
            }
            auxStack.push(temp);
        }

        while (!auxStack.isEmpty()){
            stack.push(auxStack.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);


        System.out.println("Original stack "+ stack);
        stackSort(stack);
        System.out.println("===========");
        System.out.println("Sorted stack"+ stack);
    }

}
