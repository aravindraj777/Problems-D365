package testReviewToi;

public class MainRev {

    public static void main(String[] args) {

        ThreadExample threadExample = new ThreadExample();
        Thread thread = new Thread(threadExample);
        thread.start();
    }
}
