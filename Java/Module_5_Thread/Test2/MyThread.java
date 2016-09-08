package Module_5_Thread.Test2;

/**
 * Created by Roman on 15.12.2015.
 */
public class MyThread extends Thread {
    private String type;
    private int pause;

    public MyThread(String type, int pause) {
        this.type = type;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(type + " " + i);
            try {
                Thread.sleep(pause); // задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
