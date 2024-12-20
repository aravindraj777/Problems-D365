package github.stringGitHubPractice;

public class ValueOfVariable {

    public static void main(String[] args) {

        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (String s : operations){
            if (s == "--X" || s == "X--"){
                x = x - 1;
            }
            else {
                x = x + 1;
            }
        }
        return x;
    }
}
