package Module_5_Thread.Test5_Demon;

/**
 * Created by Roman on 17.12.2015.
 */
public class MainDemon {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread thr1=new Thread(new DemonTest(), "2 tread");

        // установка потока как демона
        thr1.setDaemon(true);
        System.out.println(thr1.isDaemon());
        thr1.start();

        System.out.println("Stop program");
        t.interrupt(); // прерывание основого потока
    }
}
