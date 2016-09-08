package Module_5_Thread.Test4;

/**
 * Created by Roman on 17.12.2015.
 */
public class MainSync {
    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest);
        thread.start();

        for (int i = 0; i < 500000; i++) {
            runIncrement();
        }
        // останавливаем поток main
        thread.join();
        System.out.println(x);
    }

    // Synchronized
    static void runIncrement() {
        x++;
    }
}
