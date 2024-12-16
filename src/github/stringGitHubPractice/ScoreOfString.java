package github.stringGitHubPractice;

public class ScoreOfString {




        public static void main(String[] args) {
            int scoreOfString = score("hello");
            System.out.println(scoreOfString);
        }

        private static int score(String s){

            int score = 0;
            for (int i = 0 ; i < s.length()-1; i++){
                score += Math.abs(s.charAt(i) - s.charAt(i+1));
            }
            return score;
        }

}
