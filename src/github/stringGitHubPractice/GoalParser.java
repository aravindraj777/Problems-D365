package github.stringGitHubPractice;

import java.util.HashMap;
import java.util.Map;

public class GoalParser {

//    1678. Goal Parser Interpretation


    /*
    * ou own a Goal Parser that can interpret a string command.
    * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
    * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
    * The interpreted strings are then concatenated in the original order.

     Given the string command, return the Goal Parser's interpretation of command.



Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
    * */

    public static void main(String[] args) {
        String command = "G()()(al)";
        String interpretedCommand = interpret(command);
        System.out.println(interpretedCommand);
    }

    public static String interpret(String command) {

       StringBuilder stringBuilder = new StringBuilder(command.length());
       for (int i = 0 ; i < command.length() ; i++){
           if (command.charAt(i) == 'G'){
               stringBuilder.append('G');
           }
           if (command.charAt(i) == '('){
               if (command.charAt(i+1) == ')') {
                   stringBuilder.append('o');
                   i++;
               }
               else{
                   stringBuilder.append("al");
                   i+=3;
               }
           }
       }
       return stringBuilder.toString();
    }
}
