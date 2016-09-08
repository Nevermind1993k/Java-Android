package Module_5_Thread.Test3;

/**
 * Created by Roman on 17.12.2015.
 */
public class MainSync {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest);
        thread.start();

        // 1
        Thread.sleep(5);
        threadTest.methodC("MainSync");

        // 2
        Thread.sleep(5);
        threadTest.methodD("MainSync");

        // 3
        Thread.sleep(5);
        threadTest.methodD("MainSync");

        // 4
        Thread.sleep(5);
        threadTest.methodB("MainSync");
    }
}
