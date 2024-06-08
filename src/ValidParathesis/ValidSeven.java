package ValidParathesis;

import java.util.Stack;

public class ValidSeven {

    public static boolean isValid(String str){

        Stack<Character> stack = new Stack<>();

        for (char c: str.toCharArray()){

            if (c=='{' || c == '[' || c=='('){
                stack.push(c);
            }
            else {
                if(c == '{'){
                    if(stack.isEmpty() || stack.pop() != '}'){
                        return false;
                    }
                }
                if (c == '['){
                    if (stack.isEmpty() || stack.pop() != ']'){
                        return false;
                    }
                }
                if (c == '('){
                    if (stack.isEmpty() || stack.pop() != ')'){
                        return false;
                    }
                }
            }
        }
       return stack.isEmpty();
    }

    public static void main(String[] args) {


        System.out.println(ValidSeven.isValid("[]"));
    }
}
