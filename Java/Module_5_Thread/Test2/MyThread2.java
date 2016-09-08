package Module_5_Thread.Test2;

/**
 * Created by Roman on 15.12.2015.
 */
public class MyThread2 implements Runnable {
    private String type;
    private int pause;
    private Thread thread;

    public MyThread2(String type, int pause) {
        this.type = type;
        this.pause = pause;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(type + " " + Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(pause); // задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
