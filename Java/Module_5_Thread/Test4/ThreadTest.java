package Module_5_Thread.Test4;

import Module_5_Thread.Test3.MainSync;

/**
 * Created by Roman on 17.12.2015.
 */
public class ThreadTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            Module_5_Thread.Test4.MainSync.runIncrement(); // MainSync.rinIncrement();
        }
    }
}
