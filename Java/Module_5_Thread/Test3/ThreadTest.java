package Module_5_Thread.Test3;

/**
 * Created by Roman on 17.12.2015.
 */
public class ThreadTest implements Runnable {

    @Override
    public void run() {
        methodA("Thread 1");
    }

    synchronized void methodA(String s) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s + "syn methodA");
    }

    void methodB(String s) {
        System.out.println(s + "No syn methodB");
    }

    synchronized void methodC(String s) {
        System.out.println(s + "syn MethodC");
    }

    static synchronized void methodD(String s) {
        System.out.println(s + "syn methodD");
    }

    static synchronized void methodE(String s) {
        System.out.println(s + "syn methodE");
    }
}
