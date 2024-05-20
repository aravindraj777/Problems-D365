package ValidParathesis;

import java.util.Stack;

public class ValidFive {

    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else {
                if (c == '{'){
                    if ( stack.isEmpty() || stack.pop() != '}'){
                        return false;
                    }
                }
                if(c == '['){
                    if(stack.isEmpty() || stack.pop() != ']'){
                        return false;
                    }
                }
                if(c == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }

                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
