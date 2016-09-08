package Module_5_Thread.Test5_Demon;

/**
 * Created by Roman on 17.12.2015.
 */
public class DemonTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
